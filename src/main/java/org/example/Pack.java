package org.example;

public interface Pack {
     <T extends Fruit> FruitBox<T> doPack(T fruit, int quantity);
}
