package net.star.java;

class Apple implements Edible, Pickable {
    private double weight = 0.2;

    @Override
    public int eat() {
        return 2;
    }

    @Override
    public boolean tryPickUp(double freeBackpackSpace) {
        return freeBackpackSpace >= weight;
    }
}