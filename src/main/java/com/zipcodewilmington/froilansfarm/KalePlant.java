package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Kale;

public class KalePlant extends Crop<Kale> {

    @Override
    public Kale yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Kale();
        }
        return null;
    }
}
