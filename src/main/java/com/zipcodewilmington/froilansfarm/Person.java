package com.zipcodewilmington.froilansfarm;

public abstract class Person implements NoiseMaker {
    protected String name;
    protected boolean hasBeenFed;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(Edible food) {
        hasBeenFed = true;
    }

    public boolean hasBeenFed() {
        return hasBeenFed;
    }

    @Override
    public abstract String makeNoise();
}
