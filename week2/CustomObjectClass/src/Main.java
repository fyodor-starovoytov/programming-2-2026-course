void main() {
    Dog sulo = new Dog("Sulo", "Poodle", 2);
    Dog doge = new Dog("Doge");

    sulo.displayInfo();
    doge.displayInfo();

    sulo.age();

    sulo.displayInfo();
    doge.displayInfo();

    sulo.age();
    doge.age();
    doge.updateName("Bimbo");

    sulo.displayInfo();
    doge.displayInfo();
}
