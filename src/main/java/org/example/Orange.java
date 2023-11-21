package org.example;

public class Orange implements Fruit {
    private Double weight = 0.3;

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    @Override
    public double getWeight() {
        return weight;
    }
}
