package net.star.java;

import java.util.Arrays;

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

    public T get(int index){
        return lst[index];
    }

    public T remove(int index){

        T toReturn = lst[index];
        T[] newLst = (T[]) new Object[lst.length];

        int i0 = 0;
        for (int i = 0; i < lst.length; i++) {
            if (i == index){
                continue;
            }

            newLst[i0] = lst[i];
            i0++;
        }

        this.lst = newLst.clone();
        size--;
        return toReturn;
    }


    public boolean remove(T element){
        int index = getFirstInstance(element);
        if (index == -1){
            return false;
        }

        T[] newLst = (T[]) new Object[lst.length];

        int i0 = 0;
        for (int i = 0; i < lst.length; i++) {
            if (i == index){
                continue;
            }

            newLst[i0] = lst[i];
            i0++;
        }

        this.lst = newLst.clone();
        size--;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(lst);
    }

    private void copyList(int l){
            T[] newLst = Arrays.copyOf(lst, l * 2);
            this.lst = newLst.clone();
    }

    private int getFirstInstance(T element){
        for (int i = 0; i < lst.length; i++) {

            if (lst[i] == null){
                continue;
            }

            if (lst[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
