package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {

    @Override
    public void flies() {
        System.out.println("CropDuster is flying over the field.");
    }

    @Override
    public void fertilizes() {
        System.out.println("CropDuster is fertilizing the crops.");
    }

    public void fertilize(CropRow<?> cropRow) {
        cropRow.fertilizeCrops();
    }

    @Override
    public void operatesOnFarm() {
        System.out.println("CropDuster is operating on the farm.");
    }

    @Override
    public String makeNoise() {
        return "CropDuster goes BUZZZZ.";
    }

    @Override
    public boolean isRideable() {
        return true;
    }

    @Override
    public void mount() {
        System.out.println("Pilot mounts the CropDuster.");
    }

    @Override
    public void dismount() {
        System.out.println("Pilot dismounts the CropDuster.");
    }
}
