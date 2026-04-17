package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop {
    private ArrayList<Chicken> chickens;

    public ChickenCoop() {
        this.chickens = new ArrayList<>();
    }

    public void add(Chicken chicken) {
        chickens.add(chicken);
    }

    public void remove(Chicken chicken) {
        chickens.remove(chicken);
    }

    public Chicken get(int index) {
        return chickens.get(index);
    }

    public int size() {
        return chickens.size();
    }

    public boolean isEmpty() {
        return chickens.isEmpty();
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }
}
