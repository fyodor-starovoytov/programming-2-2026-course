package net.star.java;

public class Container<T> {

    private final T content;
    private final String owner;


    public Container(T container, String owner) {
        this.content = container;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public T getContent() {
        return content;
    }

    public String getType(){
        return content.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getOwner() + ", " +  getContent() + " and " + getType();
    }
}
