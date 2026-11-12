package net.star.java;

import java.util.Arrays;

public class List<T> {
    private T[] lst;
    private int length = 0;

    @SuppressWarnings("unchecked")
    public List(int size) {
        this.lst = (T[]) new Object[size];
    }

    public void add(T element){
        try {
            this.lst[length] = element;
            length++;
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("No space");
        }
        finally {
            IO.println("Added " + element);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(lst);
    }
}
