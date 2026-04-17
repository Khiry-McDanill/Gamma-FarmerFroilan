package com.zipcodewilmington.froilansfarm;

public class Tomato implements Edible {
    @Override
    public String eat() {
        return "Eating a tomato.";
    }

    @Override
    public boolean getIsEdible() {
        return true;
    }
}
