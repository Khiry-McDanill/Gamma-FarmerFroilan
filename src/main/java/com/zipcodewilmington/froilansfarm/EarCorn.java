package com.zipcodewilmington.froilansfarm;

public class EarCorn implements Edible {
    @Override
    public String eat() {
        return "Eating an ear of corn.";
    }

    @Override
    public boolean getIsEdible() {
        return true;
    }
}
