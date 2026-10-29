public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Maija", "M.");
        IO.println(p1.getNumber()); // 1

        Person p2 = new Person("Matti", "M.");
        IO.println(p2.getNumber()); // 2

        Person p3 = new Person("Mikko", "K.");
        IO.println(p3.getNumber()); // 3
    }
}
