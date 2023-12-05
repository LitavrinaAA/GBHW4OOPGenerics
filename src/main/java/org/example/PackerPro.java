package org.example;

public class PackerPro extends  Packer{
    public PackerPro(String name) {
        super(name);
    }

    @Override
    public String workStatus() {
        return super.workStatus();
    }

    @Override
    public <T extends Fruit> FruitBox<T> doWork(T fruit, int quantity) {
        return super.doWork(fruit, quantity);
    }

    public <T extends Fruit> void sayWeightAndQuantity(FruitBox<T> box) {
        StringBuilder str = new StringBuilder();
        str
                .append("Коробка c ")
                .append(box.typeOfFruitBox())
                .append(": вес ")
                .append(box.getWeight())
                .append(", количество")
                .append(box.getQuantity())
                ;

        System.out.println(str);
    }
}
