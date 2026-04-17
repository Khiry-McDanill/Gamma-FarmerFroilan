package com.zipcodewilmington.froilansfarm;

public class Chicken implements NoiseMaker {
    private String name;

    public Chicken(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeNoise() {
        return "Cluck cluck";
    }
}
