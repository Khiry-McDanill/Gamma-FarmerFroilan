package com.zipcodewilmington.froilansfarm;

public class PotatoRoot extends Crop<Potato> {

    @Override
    public Potato yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Potato();
        }
        return null;
    }
}
