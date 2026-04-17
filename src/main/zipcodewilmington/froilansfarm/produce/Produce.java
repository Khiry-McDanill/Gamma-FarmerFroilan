package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.Edible;

public abstract class Produce<T extends Edible> {

    protected boolean hasBeenFertilized;

    public abstract T yield();

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
