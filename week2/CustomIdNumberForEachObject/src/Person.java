public class Person {
    private String firstName;
    private String lastName;
    private int id;
    private static int peopleAmount = 0;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        peopleAmount++;
        this.id = peopleAmount;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getNumber() {
        return id;
    }
}
