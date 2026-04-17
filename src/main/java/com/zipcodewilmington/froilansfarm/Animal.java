package com.zipcodewilmington.froilansfarm;

public abstract class Animal implements NoiseMaker, Eater {
    protected String name;
    protected boolean hasBeenFed;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat(Edible food) {
        hasBeenFed = true;
    }

    public boolean hasBeenFed() {
        return hasBeenFed;
    }

    @Override
    public abstract String makeNoise();
}
