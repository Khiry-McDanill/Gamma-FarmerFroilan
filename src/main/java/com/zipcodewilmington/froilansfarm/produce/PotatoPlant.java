package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.edible.Potato;

public class PotatoPlant extends Crop<Potato> {

    @Override
    public Potato yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Potato();
        }
        return null;
    }
}
