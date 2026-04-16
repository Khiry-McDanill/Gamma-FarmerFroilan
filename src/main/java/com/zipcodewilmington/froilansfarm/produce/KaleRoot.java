package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.edible.Kale;

public class KaleRoot extends Crop<Kale> {

    @Override
    public Kale yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Kale();
        }
        return null;
    }
}
