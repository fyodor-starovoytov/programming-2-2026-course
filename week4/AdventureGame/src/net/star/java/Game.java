package net.star.java;


public class Game {
    public static void main(String[] args) {
        int playerEnergy = 50;
        double backpackSpace = 10.0;

        Apple apple = new Apple();
        LargeRock rock = new LargeRock();

        IO.println("Your initial energy: " + playerEnergy);
        IO.println("Space available in backpack: " + backpackSpace);
        IO.println("---");

        boolean rockPickupSucceeded = rock.tryPickUp(backpackSpace);
        if (!rockPickupSucceeded) {
            IO.println("-> Player: Too bad, let's leave the rock here.");
        }

        IO.println("---");

        boolean applePickupSucceeded = apple.tryPickUp(backpackSpace);
        if (applePickupSucceeded) {

            int energyGained = apple.eat();
            playerEnergy = playerEnergy + energyGained;

            IO.println("-> Player: Yum! Your energy is now " + playerEnergy);
        }
    }
}