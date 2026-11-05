import net.star.reservation.Building;
import net.star.reservation.Room;

void main() {

    Building agora = new Building("Agora");
    agora.addReservation(1, "Fedya", 2, 2);
    agora.addRoom();
    agora.addReservation(0, "Fedya", 2, 2);
    agora.addReservation(0, "NonFedya", 2, 2);
    agora.print();
}
