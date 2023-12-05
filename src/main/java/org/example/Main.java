package org.example;

public class Main {
    public static void main(String[] args) {
        Fruit plum = new Plum();
        Fruit apple = new Apple(0.2);
        Fruit orange = new Orange();
        Fruit banana = new Banana();

        FruitBox box1 = new FruitBox();
        box1.addFruit(plum);
        box1.addFruit(apple);
        box1.addFruit(orange);
        box1.addFruit(banana);
        System.out.printf("В коробка с разными фруктами весит %.1f кг.", box1.getWeight());
        System.out.println();
        /*Принцип открытости-закрытости:
        packer - только пакует
        packerPro пакует +  может рассказать что упаковано в коробке*/
        Packer packer = new Packer("Маша");
        FruitBox<Banana> boxBanana = packer.doWork(new Banana(), 4);
        System.out.printf("В коробка с бананами весит %.1f кг.", boxBanana.getWeight());
        System.out.println();
        /* Упаковщик + */
        PackerPro packerPro = new PackerPro("Оля");
        FruitBox<Plum> boxPlum = packerPro.doWork(new Plum(),10);
        packerPro.sayWeightAndQuantity(boxPlum );



        FruitBox<Orange> boxOrange = packer.doWork(new Orange(), 4);

        System.out.printf("В коробка с апельсинами весит %.1f кг.", boxOrange.getWeight());
        System.out.println();

        System.out.println("Одинаково ли весят коробки с апельсинами и с бананами?");
        System.out.println((Math.abs(boxOrange.getWeight() - boxBanana.getWeight()) <= 0.000001));


        /*Принцип разделения ответственности:
        Упаковщик - пакует
        Грузчик - пересыпает */

        Loader loader = new Loader("Вася");

        loader.doWork(packer.doWork(new Banana(),5));




    }
}