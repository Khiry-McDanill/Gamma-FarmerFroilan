package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private final Field field;
    private final List<Stable> stables = new ArrayList<>();
    private final List<ChickenCoop> chickenCoops = new ArrayList<>();
    private final FarmHouse farmHouse;

    public Farm(Field field, FarmHouse farmHouse) {
        this.field = field;
        this.farmHouse = farmHouse;
    }

    public void addStable(Stable stable) {
        stables.add(stable);
    }

    public void addChickenCoop(ChickenCoop coop) {
        chickenCoops.add(coop);
    }

    public Field getField() {
        return field;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
}
