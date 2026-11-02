import net.star.product.Clothing;
import net.star.product.Food;

void main() {
    Clothing jacket = new Clothing("Talvitakki Dulce & Käppänä", 120.00, "XL");
    Clothing pants = new Clothing("Lee Boomer", 67.69, "L");
    Food bread = new Food("Ruisleipä Reissurähjä", 2.50, "22.04.2007");
    Food milk = new Food("Falio Sininen", 0.99, "22.04.2007");

    jacket.printDetails();
    pants.printDetails();
    bread.printDetails();
    milk.printDetails();
}