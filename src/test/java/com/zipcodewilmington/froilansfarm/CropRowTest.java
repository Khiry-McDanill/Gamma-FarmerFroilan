package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class CropRowTest {

    @Test
    public void testAddCrop() {
        CropRow<Crop<?>> cropRow = new CropRow<>();
        Crop<?> crop = new CornStalk();
        cropRow.add(crop);
        Assert.assertTrue(cropRow.getCrops().contains(crop));
    }

    @Test
    public void testRemoveCrop() {
        CropRow<Crop<?>> cropRow = new CropRow<>();
        Crop<?> crop = new CornStalk();
        cropRow.add(crop);
        cropRow.remove(crop);
        Assert.assertFalse(cropRow.getCrops().contains(crop));
    }

    @Test
    public void testPlantAddsCropToRow() {
        CropRow<Crop<?>> cropRow = new CropRow<>();
        Crop<?> crop = new TomatoPlant();
        cropRow.plant(crop);
        Assert.assertTrue(cropRow.getCrops().size() > 0);
    }

    @Test
    public void testFertilizeSetsHasBeenFertilized() {
        CropRow<Crop<?>> cropRow = new CropRow<>();
        Crop<?> crop = new CornStalk();
        cropRow.add(crop);
        cropRow.fertilizeCrops();
        Assert.assertTrue(crop.isFertilized());
    }

    @Test
    public void testRemoveCropDecreasesSize() {
        CropRow<Crop<?>> cropRow = new CropRow<>();
        Crop<?> crop = new PotatoRoot();
        cropRow.add(crop);
        cropRow.remove(crop);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testFertilizeOnEmptyRowDoesNotThrow() {
        CropRow<Crop<?>> cropRow = new CropRow<>();
        cropRow.fertilizeCrops();
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testRemoveCropNotInRowDoesNotThrow() {
        CropRow<Crop<?>> cropRow = new CropRow<>();
        Crop<?> crop = new CarrotRoot();
        cropRow.remove(crop);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }
}