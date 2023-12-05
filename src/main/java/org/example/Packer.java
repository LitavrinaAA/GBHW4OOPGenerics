package org.example;

import java.util.Scanner;

/*Принцип Единой ответственности: упаковщик упаковывает

* */
public class Packer implements Employee {
    private String name;


    public Packer(String name) {
        this.name = name;
    }

    public<T extends Fruit> FruitBox<T> doWork(T fruit, int quantity) {
        FruitBox<T> boxFruit= new FruitBox<>();
        int quantityInBox = 0;
        while ( quantityInBox <= quantity) {
            quantityInBox++;
            boxFruit.addFruit(fruit);
        }
        return boxFruit;
    }


    @Override
    public String workStatus() {
        return "Я иду паковать!";
    }
}
