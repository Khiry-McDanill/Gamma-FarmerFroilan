package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class TomatoCropRowTest {

    @Test
    public void testAddCrop() {
        TomatoCropRow cropRow = new TomatoCropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.add(tomatoPlant);
        Assert.assertTrue(cropRow.getCrops().contains(tomatoPlant));
    }

    @Test
    public void testRemoveCrop() {
        TomatoCropRow cropRow = new TomatoCropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.add(tomatoPlant);
        cropRow.remove(tomatoPlant);
        Assert.assertFalse(cropRow.getCrops().contains(tomatoPlant));
    }

    @Test
    public void testRemoveCropDecreasesSize() {
        TomatoCropRow cropRow = new TomatoCropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.add(tomatoPlant);
        cropRow.remove(tomatoPlant);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testPlantAddsCropToRow() {
        TomatoCropRow cropRow = new TomatoCropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.plant(tomatoPlant);
        Assert.assertTrue(cropRow.getCrops().size() > 0);
    }

    @Test
    public void testFertilizeSetsHasBeenFertilized() {
        TomatoCropRow cropRow = new TomatoCropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.add(tomatoPlant);
        cropRow.fertilizeCrops();
        Assert.assertTrue(tomatoPlant.isFertilized());
    }

    @Test
    public void testFertilizeOnEmptyRowDoesNotThrow() {
        TomatoCropRow cropRow = new TomatoCropRow();
        cropRow.fertilizeCrops();
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testRemoveCropNotInRowDoesNotThrow() {
        TomatoCropRow cropRow = new TomatoCropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.remove(tomatoPlant);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }
}
