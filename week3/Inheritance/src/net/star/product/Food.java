package net.star.product;

public class Food extends Product {
    private String bestBefore;

    public Food(String NAME, double PRICE, String bestBefore) {
        super(NAME, PRICE);
        this.bestBefore = bestBefore;
    }

    public void eat(){
        IO.println("You consume " + getName() + " whose expiration date is " + bestBefore + ".");
    }
}
