package com.zipcodewilmington.froilansfarm;

public class KaleRoot extends Crop<Kale> {

    @Override
    public Kale yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Kale();
        }
        return null;
    }
}
