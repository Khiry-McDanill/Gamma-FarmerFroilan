package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Farm {
    private FarmHouse farmHouse;
    private Field field;
    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> chickenCoops;

    public Farm() {
        this.farmHouse = new FarmHouse();
        this.field = new Field();
        this.stables = new ArrayList<>();
        this.chickenCoops = new ArrayList<>();
    }

    public FarmHouse getFarmHouse() { return farmHouse; }
    public Field getField() { return field; }
    public ArrayList<Stable> getStables() { return stables; }
    public ArrayList<ChickenCoop> getChickenCoops() { return chickenCoops; }

    public void addStable(Stable stable) { stables.add(stable); }
    public void addChickenCoop(ChickenCoop chickenCoop) { chickenCoops.add(chickenCoop); }
}
