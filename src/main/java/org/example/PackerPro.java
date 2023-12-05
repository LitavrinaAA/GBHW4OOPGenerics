package org.example;

public class PackerPro extends  Packer implements Pack, Talking {
    public PackerPro(String name) {
        super(name);
    }

    @Override
    public String workStatus() {
        return "Я иду паковать и потом отчет сделаю!";
    }

    @Override
    public <T extends Fruit> FruitBox<T> doPack(T fruit, int quantity) {
        return super.doPack(fruit, quantity);
    }

    public <T extends Fruit> void say(FruitBox<T> box) {
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
