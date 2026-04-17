package com.zipcodewilmington.froilansfarm;

public class Carrot implements Edible {
    @Override
    public String eat() {
        return "Eating a carrot.";
    }

    @Override
    public boolean getIsEdible() {
        return true;
    }
}
