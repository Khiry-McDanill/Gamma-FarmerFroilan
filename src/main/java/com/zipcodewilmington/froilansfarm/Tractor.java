package com.zipcodewilmington.froilansfarm;

public class Tractor extends Vehicle implements FarmVehicle {

    public void harvestsCrop() {
        System.out.println("Tractor is harvesting the crops.");
    }

    @Override
    public void operatesOnFarm() {
        System.out.println("Tractor is operating on the farm.");
    }

    @Override
    public String makeNoise() {
        return "Tractor goes VROOM.";
    }

    @Override
    public boolean isRideable() {
        return true;
    }

    @Override
    public void mount() {
        System.out.println("Farmer mounts the Tractor.");
    }

    @Override
    public void dismount() {
        System.out.println("Farmer dismounts the Tractor.");
    }
}