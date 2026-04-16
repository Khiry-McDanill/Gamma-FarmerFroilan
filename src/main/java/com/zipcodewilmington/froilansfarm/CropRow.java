package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow<T extends Crop> implements Plantable {
    protected ArrayList<T> crops;

    public CropRow() {
        this.crops = new ArrayList<>();
    }

    public void add(T crop) {
        crops.add(crop);
    }

    public void remove(T crop) {
        crops.remove(crop);
    }

    public void plant(T crop) {
        crops.add(crop);
    }

    public void fertilizeCrops() {
        for (T crop : crops) {
            crop.flyover();
        }
    }

    public ArrayList<T> getCrops() {
        return crops;
    }
}
