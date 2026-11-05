import net.star.vehicle.Airplane;
import net.star.vehicle.Car;
import net.star.vehicle.Vehicle;

void main() {

    Vehicle vehicle0 = new Car("BMW");
    Vehicle vehicle1 = new Airplane("Airbus");

    vehicle0.move();
    vehicle1.move();

}
