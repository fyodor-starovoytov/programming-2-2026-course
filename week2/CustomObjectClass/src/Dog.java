public class Dog {
    private String breed;
    private String name;
    private int age;

    public Dog(String name, String breed, int age) {
        if (age < 0){
            IO.println("Age has to be 0 or over");
            return;
        }

        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
        this.age = 0;
    }

    public Dog(String name) {
        this.breed = "Mixed-breed";
        this.name = name;
        this.age = 0;
    }

    public void age(){
        this.age = this.age + 1;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        IO.println("Name: " + this.name + "\n" +
                "Breed: " + this.breed + "\n" +
                "Age: " + this.age + "\n");
    }
}
