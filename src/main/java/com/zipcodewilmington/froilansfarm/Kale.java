package com.zipcodewilmington.froilansfarm;

public class Kale implements Edible {
    @Override
    public String eat() {
        return "Eating kale.";
    }

    @Override
    public boolean getIsEdible() {
        return true;
    }
}
