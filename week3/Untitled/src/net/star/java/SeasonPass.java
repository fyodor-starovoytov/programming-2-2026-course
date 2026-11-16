package net.star.java;

public class SeasonPass extends LiftPass{
    public SeasonPass(String owner, int price) {
        super(owner, price);
    }

    @Override
    public int price() {
        return super.price() * 20;
    }
}
