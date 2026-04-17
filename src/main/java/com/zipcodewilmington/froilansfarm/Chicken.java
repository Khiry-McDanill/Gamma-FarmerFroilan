package com.zipcodewilmington.froilansfarm;

public class Chicken {
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
