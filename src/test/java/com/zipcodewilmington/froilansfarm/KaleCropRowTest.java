package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class KaleCropRowTest {

    @Test
    public void testAddCrop() {
        KaleCropRow cropRow = new KaleCropRow();
        KaleRoot kaleRoot = new KaleRoot();
        cropRow.add(kaleRoot);
        Assert.assertTrue(cropRow.getCrops().contains(kaleRoot));
    }

    @Test
    public void testRemoveCrop() {
        KaleCropRow cropRow = new KaleCropRow();
        KaleRoot kaleRoot = new KaleRoot();
        cropRow.add(kaleRoot);
        cropRow.remove(kaleRoot);
        Assert.assertFalse(cropRow.getCrops().contains(kaleRoot));
    }

    @Test
    public void testRemoveCropDecreasesSize() {
        KaleCropRow cropRow = new KaleCropRow();
        KaleRoot kaleRoot = new KaleRoot();
        cropRow.add(kaleRoot);
        cropRow.remove(kaleRoot);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testPlantAddsCropToRow() {
        KaleCropRow cropRow = new KaleCropRow();
        KaleRoot kaleRoot = new KaleRoot();
        cropRow.plant(kaleRoot);
        Assert.assertTrue(cropRow.getCrops().size() > 0);
    }

    @Test
    public void testFertilizeSetsHasBeenFertilized() {
        KaleCropRow cropRow = new KaleCropRow();
        KaleRoot kaleRoot = new KaleRoot();
        cropRow.add(kaleRoot);
        cropRow.fertilizeCrops();
        Assert.assertTrue(kaleRoot.isFertilized());
    }

    @Test
    public void testFertilizeOnEmptyRowDoesNotThrow() {
        KaleCropRow cropRow = new KaleCropRow();
        cropRow.fertilizeCrops();
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testRemoveCropNotInRowDoesNotThrow() {
        KaleCropRow cropRow = new KaleCropRow();
        KaleRoot kaleRoot = new KaleRoot();
        cropRow.remove(kaleRoot);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }
}
