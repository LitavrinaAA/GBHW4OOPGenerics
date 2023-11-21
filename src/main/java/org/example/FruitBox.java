package org.example;

/*коробка с фруктами

 */
public class FruitBox<T extends Fruit> {
    private Double weight;
    private Integer quantity;

    public FruitBox() {
        this.weight = 0.0;
        this.quantity = 0;
    }

    void addFruit(T fruit) {
        this.weight += fruit.getWeight();
        quantity ++;

    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    double getWeight() {
        return weight;
    }
    FruitBox<T> pour(){
        FruitBox<T> newFruitBox = new FruitBox<>();
        newFruitBox.weight = weight;
        newFruitBox.quantity = quantity;
        weight = 0.0;
        quantity = 0;
        return newFruitBox;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
