package net.star.java;

class LargeRock implements Pickable {
    private double weight = 50.0;

    @Override
    public boolean tryPickUp(double freeBackpackSpace) {
        return freeBackpackSpace >= weight;
    }
}