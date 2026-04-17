package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Tomato;

public class TomatoPlant extends Crop<Tomato> {

    @Override
    public Tomato yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Tomato();
        }
        return null;
    }
}
