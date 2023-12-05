package org.example;

public interface Load {
    public<T extends Fruit> FruitBox<T> overfilling (FruitBox<T> box);
}
