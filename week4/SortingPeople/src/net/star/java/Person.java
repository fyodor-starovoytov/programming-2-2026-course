package net.star.java;

public class Person implements Comparable<Person>{
    private String lastName;
    private String firstName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }

    @Override
    public int compareTo(Person o) {
        String n = lastName + " " + firstName;
        return n.compareTo(o.toString());
    }
}
