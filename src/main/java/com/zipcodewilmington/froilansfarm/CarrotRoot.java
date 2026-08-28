package com.zipcodewilmington.froilansfarm;

public class CarrotRoot extends Crop {

    @Override
    public Edible yield() {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new Carrot();
        }

        return null;
    }
}
