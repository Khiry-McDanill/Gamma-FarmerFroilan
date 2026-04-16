package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Field {
    private ArrayList<CropRow<?>> cropRows;

    public Field() {
        this.cropRows = new ArrayList<>();
    }

    public void addCropRow(CropRow<?> cropRow) {
        cropRows.add(cropRow);
    }

    public void removeCropRow(CropRow<?> cropRow) {
        cropRows.remove(cropRow);
    }

    public ArrayList<CropRow<?>> getCropRows() {
        return cropRows;
    }
}
