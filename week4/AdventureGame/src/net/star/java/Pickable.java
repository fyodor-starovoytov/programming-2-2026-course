package net.star.java;

public interface Pickable {
    /**
     * Picks up the item if there is enough space in the backpack.
     *
     * @param freeBackpackSpace Amount of free space in the backpack
     * @return Whether the item fits in the backpack
     */
    boolean tryPickUp(double freeBackpackSpace);
}
