package org.example;

public class Apple implements Fruit {
    private Double weight = 0.2;

    public Apple(Double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Яблоко";
    }
}
