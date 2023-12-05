package org.example;

public class Loader extends Employee implements Load{
    String name;

    public Loader(String вася) {
        this.name = name;
    }

    @Override
    public String workStatus() {
        return "Я пошел пересыпать!";
    }
    public <T extends Fruit> FruitBox<T> overfilling (FruitBox<T> boxOld) {
        FruitBox<T> boxNew = new FruitBox<>();
        boxNew = boxOld.pour();
        System.out.println("Пересыпал " + boxOld.typeOfFruitBox() + "  в другую коробку:");
        System.out.printf("Теперь тут пусто: вес %.1f , количество %d"
                ,boxOld.getWeight(),boxOld.getQuantity() );
        System.out.println();

        System.out.printf("Коробка %s вес %.1f , количество %d",
                boxOld.typeOfFruitBox(),boxNew.getWeight(),boxNew.getQuantity() );
        System.out.println();
        return boxNew;
    }
}
