package com.zipcodewilmington.froilansfarm;



public abstract class Vehicle implements Rideable, NoiseMaker {
    public abstract String makeNoise();
    public abstract boolean isRideable();
}