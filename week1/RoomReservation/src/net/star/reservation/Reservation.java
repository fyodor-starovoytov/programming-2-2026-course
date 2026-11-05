package net.star.reservation;

public class Reservation {

    private String reservation;
    private final int ROOM_NUMBER;
    private final int TIME_SLOT;
    private final int TIME_PERIOD_HOURS;

    public Reservation(String reservation, int roomNumber, int timeSlot, int timePeriod) {
        this.reservation = reservation;
        ROOM_NUMBER = roomNumber;
        TIME_SLOT = timeSlot;
        TIME_PERIOD_HOURS = timePeriod;
    }


    public void print(){
        IO.println("   ");
        IO.println(reservation);
    }
}
