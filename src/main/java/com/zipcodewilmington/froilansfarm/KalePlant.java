package com.zipcodewilmington.froilansfarm;

public class KalePlant extends Crop<Kale> {

    @Override
    public Kale yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Kale();
        }
        return null;
    }
}
