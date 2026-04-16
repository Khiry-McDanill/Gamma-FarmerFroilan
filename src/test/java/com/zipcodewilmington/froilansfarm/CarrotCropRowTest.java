package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class CarrotCropRowTest {

    @Test
    public void testAddCrop() {
        CarrotCropRow cropRow = new CarrotCropRow();
        CarrotRoot carrotRoot = new CarrotRoot();
        cropRow.add(carrotRoot);
        Assert.assertTrue(cropRow.getCrops().contains(carrotRoot));
    }

    @Test
    public void testRemoveCrop() {
        CarrotCropRow cropRow = new CarrotCropRow();
        CarrotRoot carrotRoot = new CarrotRoot();
        cropRow.add(carrotRoot);
        cropRow.remove(carrotRoot);
        Assert.assertFalse(cropRow.getCrops().contains(carrotRoot));
    }

    @Test
    public void testRemoveCropDecreasesSize() {
        CarrotCropRow cropRow = new CarrotCropRow();
        CarrotRoot carrotRoot = new CarrotRoot();
        cropRow.add(carrotRoot);
        cropRow.remove(carrotRoot);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testPlantAddsCropToRow() {
        CarrotCropRow cropRow = new CarrotCropRow();
        CarrotRoot carrotRoot = new CarrotRoot();
        cropRow.plant(carrotRoot);
        Assert.assertTrue(cropRow.getCrops().size() > 0);
    }

    @Test
    public void testFertilizeSetsHasBeenFertilized() {
        CarrotCropRow cropRow = new CarrotCropRow();
        CarrotRoot carrotRoot = new CarrotRoot();
        cropRow.add(carrotRoot);
        cropRow.fertilizeCrops();
        Assert.assertTrue(carrotRoot.isFertilized());
    }

    @Test
    public void testFertilizeOnEmptyRowDoesNotThrow() {
        CarrotCropRow cropRow = new CarrotCropRow();
        cropRow.fertilizeCrops();
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testRemoveCropNotInRowDoesNotThrow() {
        CarrotCropRow cropRow = new CarrotCropRow();
        CarrotRoot carrotRoot = new CarrotRoot();
        cropRow.remove(carrotRoot);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }
}
