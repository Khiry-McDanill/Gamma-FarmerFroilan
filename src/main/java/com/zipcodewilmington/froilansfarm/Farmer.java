package com.zipcodewilmington.froilansfarm;

public class Farmer implements NoiseMaker {
    private String name;
    private boolean hasBeenFed;
    private boolean isRiding;

    public Farmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makesNoise() {
        return name + " says yo";
    }

    public String makeNoise() {
        return "YeeHaw";
    }

    public void eat(Edible food) {
        hasBeenFed = true;
    }

    public boolean hasBeenFed() {
        return hasBeenFed;
    }

    public void mount(Horse horse) {
        horse.setMounted(true);
        isRiding = true;
    }

    public void dismount(Horse horse) {
        horse.setMounted(false);
        isRiding = false;
    }

    public boolean isRiding() {
        return isRiding;
    }

    public void plant(Crop<?> crop, CropRow cropRow) {
        cropRow.plant(crop);
    }
}
