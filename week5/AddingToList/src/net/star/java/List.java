package net.star.java;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class List<T> {
    private T[] lst;
    private int size = 0;

    public List(int size) {
        this.lst = (T[]) new Object[size];
    }

    public void add(T element){

        int l = lst.length;
        if (size >= l) {
            copyList(l);
        }

        this.lst[size] = element;
        size++;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(lst);
    }

    public void copyList(int l){
            T[] newLst = Arrays.copyOf(lst, l * 2);
            this.lst = newLst.clone();
    }
}
