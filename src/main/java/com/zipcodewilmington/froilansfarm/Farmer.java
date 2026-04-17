package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person {
    private boolean isRiding;

    public Farmer(String name) {
        super(name);
    }

    public String makesNoise() {
        return name + " says yo";
    }

    @Override
    public String makeNoise() {
        return "YeeHaw";
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

    public <T extends Crop<?>> void plant(T crop, CropRow<T> cropRow) {
        cropRow.plant(crop);
    }
}
