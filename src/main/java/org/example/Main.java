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
        PackerPro packerPro = new PackerPro("Оля");

        FruitBox<Plum> boxPlum = packerPro.doWork(new Plum(),10);
        packerPro.sayWeightAndQuantity(boxPlum );



        FruitBox<Banana> boxBanana = packer.doWork(new Banana(), 4);
        System.out.printf("В коробка с бананами весит %.1f кг.", boxBanana.getWeight());
        System.out.println();

        Loader loader = new Loader("Вася");

        FruitBox<Orange> boxOrange = packer.doWork(new Orange(), 4);

        System.out.printf("В коробка с апельсинами весит %.1f кг.", boxOrange.getWeight());
        System.out.println();

        System.out.println("Одинаково ли весят коробки с апельсинами и с бананами?");
        System.out.println((Math.abs(boxOrange.getWeight() - boxBanana.getWeight()) <= 0.000001));

        FruitBox<Banana> boxBanana2 = new FruitBox<>();
        boxBanana2 = boxBanana.pour();
        System.out.println("Пересыпала бананы в другую коробку:");
        System.out.printf("Коробка boxBanana вес %.1f , количество %d"
                ,boxBanana.getWeight(),boxBanana.getQuantity() );
        System.out.println();

        System.out.printf("Коробка boxBanana2 вес %.1f , количество %d"
                ,boxBanana2.getWeight(),boxBanana2.getQuantity() );
        System.out.println();



    }
}