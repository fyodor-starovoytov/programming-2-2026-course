package net.star.java;

import java.util.Stack;

public class LargeContainer<T> {

    private Stack<T> contents;

    public LargeContainer() {
        this.contents = new Stack<>();
    }

    public void add(T object){
        contents.push(object);
    }

    public T take(){
        return contents.pop();
    }

    public T peek(){
        return contents.peek();
    }

    public boolean contains(T object){
         if (contents.isEmpty()){
             return false;
         }

         for (T element : contents){
             if (element.equals(object)){
                 return true;
             }
         }

         return false;
    }

    public void print(){
        for (T element : contents){
            IO.println(element + ", " + element.getClass().getSimpleName());
        }
    }
}


