package net.star.vehicle;

public class Airplane extends Vehicle {
    public int flightHours;

     Airplane(String brand, int flightHours) {
        super(brand);
        this.flightHours = flightHours;
    }
    public Airplane(String brand) {
        super(brand);
        this.flightHours = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Flight hours: " + flightHours;
    }

    @Override
    public void move() {
        flightHours = flightHours + 1;
        IO.println("Airplane " + brand + " takes off from the runway and flies above the clouds.");
    }
}
