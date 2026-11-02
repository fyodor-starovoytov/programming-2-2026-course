package net.star.product;

public class Clothing extends Product {
    private final String size;

    public Clothing(String NAME, double PRICE, String size) {
        super(NAME, PRICE);
        this.size = size;
    }

    public void tryOn(String customerSize){
        if (customerSize.equals(size)){
            IO.println("Is suitable for " + customerSize);
        }
        else {
            IO.println("Is not suitable for " + customerSize);
        }
    }
}
