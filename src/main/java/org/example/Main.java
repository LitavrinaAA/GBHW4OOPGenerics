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

        FruitBox<Apple> boxApple = new FruitBox<>();
        boxApple.addFruit(new Apple(0.1));
        boxApple.addFruit(new Apple(0.2));
        boxApple.addFruit(new Apple(0.3));
        boxApple.addFruit(new Apple(0.4));
        System.out.printf("В коробка с яблоками весит %.1f кг.", boxApple.getWeight());
        System.out.println();

        FruitBox<Banana> boxBanana = new FruitBox<>();
        boxBanana.addFruit(new Banana());
        boxBanana.addFruit(new Banana());
        boxBanana.addFruit(new Banana());
        boxBanana.addFruit(new Banana());
        System.out.printf("В коробка с бананами весит %.1f кг.", boxBanana.getWeight());
        System.out.println();

        FruitBox<Orange> boxOrange = new FruitBox<>();
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());
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