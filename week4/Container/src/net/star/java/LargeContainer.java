package net.star.java;

import java.util.Stack;

public class LargeContainer<T> {

    private Stack<T> contents;

    public LargeContainer() {
        this.contents = new Stack<>();
    }

    public static double sumNumbers(LargeContainer<? extends Number> container){
        double sum = 0;

        Stack<Number> temp = new Stack<>();
        temp.addAll(container.contents);

        int size = temp.size();
        if (temp.isEmpty()){
            return sum;
        }

        for (int i = 0; i < size; i++){
            Number element = temp.pop();
            sum +=  element.doubleValue();
        }

        return sum;
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
        if (contents.isEmpty()){
            IO.println("Nothing to print");
        }

        for (T element : contents){
            IO.println(element);
        }
    }

    public void transferAll (LargeContainer<? super T> otherContainer){

        Stack<T> temp = new Stack<>();
        temp.addAll(this.contents);

        int size = temp.size();
        for (int i = 0; i < size; i++){
            otherContainer.add(temp.pop());
        }

        this.contents.clear();
    }
}


