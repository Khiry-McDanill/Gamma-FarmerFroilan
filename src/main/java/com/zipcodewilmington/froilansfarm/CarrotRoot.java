package com.zipcodewilmington.froilansfarm;

public class CarrotRoot extends Crop<Carrot> {

    @Override
    public Carrot yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new Carrot();
        }
        return null;
    }


}
