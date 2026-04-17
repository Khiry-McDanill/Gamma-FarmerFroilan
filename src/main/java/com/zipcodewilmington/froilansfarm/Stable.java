package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> horses;

    public Stable() {
        this.horses = new ArrayList<>();
    }

    public void add(Horse horse) {
        horses.add(horse);
    }

    public void remove(Horse horse) {
        horses.remove(horse);
    }

    public Horse get(int index) {
        return horses.get(index);
    }

    public int size() {
        return horses.size();
    }

    public boolean isEmpty() {
        return horses.isEmpty();
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }
}
