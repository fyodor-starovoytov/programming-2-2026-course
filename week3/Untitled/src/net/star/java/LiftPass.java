package net.star.java;

public class LiftPass {
    private String owner;
    private int price;

    public LiftPass(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }

    public int price() {
        return price;
    }
}
