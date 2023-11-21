package org.example;

public class Banana implements Fruit {
    private Double weight = 0.4;

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
