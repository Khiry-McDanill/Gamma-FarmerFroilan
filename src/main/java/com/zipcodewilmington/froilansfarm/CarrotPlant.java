package com.zipcodewilmington.froilansfarm;

public class CarrotPlant extends Crop<Carrot> {

    @Override
    public Carrot yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Carrot();
        }
        return null;
    }
}
