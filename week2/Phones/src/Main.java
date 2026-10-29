void main() {

    Phone phone = new Phone("Smartophone", 50);

    phone.printInfo();

    phone.call("Sauli Niinistö", 10);
    phone.sendMessage("Alexander Stubb", "Hi, just called Sauli..");

    phone.printInfo();

    phone.charge(100);
    phone.printInfo();
}
