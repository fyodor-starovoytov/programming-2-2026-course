package net.star.product;

public abstract class AbstractProductObject {
    private final String NAME;
    private final Double PRICE;

    public AbstractProductObject(String NAME, Double PRICE) {
        this.NAME = NAME;
        this.PRICE = PRICE;
    }

    public void printDetails(){
        IO.println(NAME +": " + PRICE + "€");
    }
}
