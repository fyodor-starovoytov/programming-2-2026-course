package net.star.product;

public abstract class Product {
    private final String name;
    private final Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void printDetails(){
        IO.println(name +": " + price + "€");
    }
}
