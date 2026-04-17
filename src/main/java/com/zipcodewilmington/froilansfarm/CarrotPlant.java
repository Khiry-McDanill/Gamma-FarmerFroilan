package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Carrot;

public class CarrotPlant extends Crop<Carrot> {

    @Override
    public Carrot yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Carrot();
        }
        return null;
    }
}
