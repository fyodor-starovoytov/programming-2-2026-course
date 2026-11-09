import net.star.java.Person;

void main() {
    List<Person> people = Arrays.asList(
            new Person("Pacius", "Fredrik"),
            new Person("Mozart", "Wolfgang Amadeus"),
            new Person("Mozart", "Leopold"),
            new Person("Chopin", "Frédéric"),
            new Person("Ahonen", "Janne"),
            new Person("Öylätti", "Hillevi"),
            new Person("Hiltunen", "Irmeli")
    );

    Collections.sort(people);

    for (Person person : people) {
        IO.println(person);
    }
}

