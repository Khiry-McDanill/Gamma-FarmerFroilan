package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.Kale;

public class KalePlant extends Crop<Kale> {

    @Override
    public Kale yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Kale();
        }
        return null;
    }
}
