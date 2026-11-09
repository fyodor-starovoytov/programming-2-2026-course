package net.star.reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Room{
    private static List<Room> room_list = new ArrayList<>();
    private List<Reservation> room_reservations;
    private final int ROOM_NUMBER;
    private final String[] OPENING_TIMES = {"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00",
            "07:00", "08:00",  "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00",
            "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"};


    private String[] roomReservationTimes = {"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00",
            "07:00", "08:00",  "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00",
            "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"};

    public Room() {
        this.ROOM_NUMBER = room_list.size();
        this.room_reservations = new ArrayList<>();
        room_list.add(this);
    }



    public void reserve(String reserver, int timeSlot, int timePeriodInHours){
        if (timePeriodInHours < 1){
            IO.println("ERROR: Reservation period must be over 1 hour\n");
            return;
        }

        if (timeSlot < 0 || timeSlot > 23 || timeSlot + timePeriodInHours > 23){
            IO.println("ERROR: Reservation must be between 00:00 and 23:00\n");
            return;
        }

        for (int i = timeSlot; i < timeSlot + timePeriodInHours; i++) {

            if (roomReservationTimes[i].equalsIgnoreCase("Reserved")){
                IO.println("ERROR: Time slot (" + OPENING_TIMES[timeSlot] + ") already reserved\n");
                return;
            }
        }

        StringBuilder reservation = new StringBuilder("Room " + ROOM_NUMBER + ", for ");
        reservation.append(roomReservationTimes[timeSlot] + "-" + roomReservationTimes[timeSlot+timePeriodInHours]);
        for (int i = timeSlot; i < timeSlot + timePeriodInHours; i++) {
            roomReservationTimes[i] = "Reserved";
        }
        room_reservations.add(new Reservation(reservation.toString(), ROOM_NUMBER, timeSlot, timePeriodInHours));
        IO.println("Reserved: " + reservation + "\nby " + reserver + "\n");
    }

    public void availableTimes(){
            IO.println(Arrays.toString(roomReservationTimes));
    }

    public void print(){
        IO.println("Room: " + ROOM_NUMBER);
        availableTimes();
        IO.println("   ");
        IO.println("Reservations:");
        for (Reservation reservation : room_reservations){
            reservation.print();
        }
    }

    public int getNumber() {
        return ROOM_NUMBER;
    }
}
