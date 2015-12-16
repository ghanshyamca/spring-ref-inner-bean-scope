package org;

public class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car[" + model + "]";
    }

    public void setModel(String model) {
       this.model = model;
    }
}
