package com.zipcodewilmington.froilansfarm;

public abstract class Crop<T extends Edible> extends Produce<T> {

    protected boolean hasBeenHarvested;

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}
