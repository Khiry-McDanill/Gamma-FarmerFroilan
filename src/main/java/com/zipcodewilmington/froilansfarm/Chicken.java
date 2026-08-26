package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;

    public Chicken() {
        this(false);
    }

    public Chicken(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public Edible yield() {
        // TODO: implement assignment rule
        return null;
    }
}
