package com.zipcodewilmington.froilansfarm;


public class TomatoPlant extends Crop<Tomato> {

    @Override
    public Tomato yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Tomato();
        }
        return null;
    }
}
