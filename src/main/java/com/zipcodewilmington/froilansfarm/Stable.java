package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Stable extends Shelter {

    private final List<Horse> horses = new ArrayList<>();

    public void addHorse(Horse horse) {
        horses.add(horse);
    }

    public List<Horse> getHorses() {
        return horses;
    }
}
