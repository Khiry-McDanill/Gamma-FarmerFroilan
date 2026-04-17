package com.zipcodewilmington.froilansfarm.produce;

import EarCorn;

public class CornStalk extends Crop<EarCorn> {

    @Override
    public EarCorn yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new EarCorn();
        }
        return null;
    }
}
