package com.zipcodewilmington.froilansfarm;

public class Botanist implements NoiseMaker {
    private String name;
    private boolean hasBeenFed;

    public Botanist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String makeNoise() {
        return "I know plants!";
    }

    public void eat(Edible food) {
        hasBeenFed = true;
    }

    public boolean hasBeenFed() {
        return hasBeenFed;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public void plant(Crop<?> crop, CropRow cropRow) {
        cropRow.plant(crop);
    }

    @SuppressWarnings("rawtypes")
    public void fertilize(CropRow cropRow) {
        cropRow.fertilizeCrops();
    }
}
