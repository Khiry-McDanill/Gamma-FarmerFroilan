package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal {
    private boolean hasBeenFertilized;

    public Chicken(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Cluck cluck";
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Egg yield() {
        return new Egg(hasBeenFertilized);
    }
}
