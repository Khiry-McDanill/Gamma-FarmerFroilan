package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.EarCorn;

public class CornStalk extends Crop<EarCorn> {

    @Override
    public EarCorn yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new EarCorn();
        }
        return null;
    }
}
