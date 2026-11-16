package net.star.java;

public class DayPass extends LiftPass{

    private int days;

    public DayPass(String owner, int price, int days) {
        super(owner, price);
        this.days = days;
    }

    @Override
    public int price() {
        return super.price() * days;
    }
}
