package net.star.vehicle;

public class Vehicle {
    public String brand;


    public Vehicle(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle "+ brand +" information: ";
    }

    public void move(){};
}
