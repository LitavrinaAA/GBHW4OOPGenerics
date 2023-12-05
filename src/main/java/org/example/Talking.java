package org.example;

public interface Talking {
    <T extends Fruit> void say(FruitBox<T> box);
}
