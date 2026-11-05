package net.star.vehicle;

public class Car extends Vehicle {
    public int mileage;

    public Car(String brand, int mileage) {
        super(brand);
        this.mileage = mileage;
    }

    public Car(String brand) {
        super(brand);
        this.mileage = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Mileage: " + mileage;
    }

    @Override
    public void move() {
        mileage = mileage + 10;
        IO.println("Car " + brand + " drives down the highway with its tires squealing.");
    }
}
