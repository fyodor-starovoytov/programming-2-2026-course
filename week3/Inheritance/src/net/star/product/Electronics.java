package net.star.product;

public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int warrantyRemaining(int monthsElapsed){
        return Math.max(0, warrantyMonths-monthsElapsed);
    }
}
