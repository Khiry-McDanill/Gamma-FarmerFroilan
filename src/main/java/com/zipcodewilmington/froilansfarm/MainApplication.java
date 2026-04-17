package com.zipcodewilmington.froilansfarm;

public class MainApplication {

    public static void main(String[] args) {
        Farm farm = new Farm();

        // Field: 5 CropRows
        Field field = farm.getField();
        CornCropRow cornRow = new CornCropRow();
        cornRow.add(new CornStalk());

        TomatoCropRow tomatoRow = new TomatoCropRow();
        tomatoRow.add(new TomatoPlant());

        KaleCropRow kaleRow = new KaleCropRow();
        kaleRow.add(new KaleRoot());

        PotatoCropRow potatoRow = new PotatoCropRow();
        potatoRow.add(new PotatoRoot());

        CarrotCropRow carrotRow = new CarrotCropRow();
        carrotRow.add(new CarrotRoot());

        field.addCropRow(cornRow);
        field.addCropRow(tomatoRow);
        field.addCropRow(kaleRow);
        field.addCropRow(potatoRow);
        field.addCropRow(carrotRow);

        // 15 Chickens across 4 ChickenCoops
        int[] chickenCounts = {4, 4, 4, 3};
        int chickenNumber = 1;
        for (int count : chickenCounts) {
            ChickenCoop coop = new ChickenCoop();
            for (int i = 0; i < count; i++) {
                coop.add(new Chicken("Chicken" + chickenNumber++));
            }
            farm.addChickenCoop(coop);
        }

        // 10 Horses across 3 Stables
        int[] horseCounts = {4, 3, 3};
        int horseNumber = 1;
        for (int count : horseCounts) {
            Stable stable = new Stable();
            for (int i = 0; i < count; i++) {
                stable.add(new Horse("Horse" + horseNumber++));
            }
            farm.addStable(stable);
        }

        // Residents
        Farmer froilan = new Farmer("Froilan");
        Froilanda froilanda = new Froilanda("Froilanda");
        farm.getFarmHouse().add(froilan);
        farm.getFarmHouse().add(froilanda);

        // 2 FarmVehicles + 1 Aircraft (CropDuster)
        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();

        System.out.println("=== Froilan's Farm is ready! ===");
        System.out.println("Field rows: " + field.getCropRows().size());
        System.out.println("Stables: " + farm.getStables().size());
        System.out.println("Chicken coops: " + farm.getChickenCoops().size());
        System.out.println("Residents: " + farm.getFarmHouse().size());

        // Sunday: Froilan plants crops
        System.out.println("\n--- Sunday: Froilan plants ---");
        froilan.plant(new CornStalk(), cornRow);
        froilan.plant(new TomatoPlant(), tomatoRow);
        froilan.plant(new KaleRoot(), kaleRow);

        // Monday: Froilanda fertilizes the field
        System.out.println("\n--- Monday: Froilanda fertilizes ---");
        froilanda.fertilizeField(field);

        // Tuesday: Froilan uses the Tractor to harvest
        System.out.println("\n--- Tuesday: Froilan harvests ---");
        tractor1.harvestsCrop();
        for (CropRow<?> row : field.getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                crop.setHasBeenHarvested(true);
            }
        }
    }
}

