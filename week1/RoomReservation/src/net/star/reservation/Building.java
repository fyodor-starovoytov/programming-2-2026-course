package net.star.reservation;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class Building {
    private String name;
    private List<Room> rooms = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    public Room getRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getNumber() == (roomNumber)) {
                return room;
            }
        }
        return null;
    }

    public void addRoom() {
        rooms.add(new Room());
    }

    public void addReservation(int roomNumber, String reserver, int startTime, int duration) {
        Room room = getRoom(roomNumber);

        if (room == null) {
            IO.println("ERROR: Building '" + name + "' does not contain a room with number '" + roomNumber + "'\n");
            return;
        }

        room.reserve(reserver, startTime, duration);
    }

    public void print() {
        IO.println(name);

        for (Room room : rooms) {
            room.print();
        }
    }
}