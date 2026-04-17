package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class CornCropRowTest {

    @Test
    public void testAddCrop() {
        CornCropRow cropRow = new CornCropRow();
        CornStalk cornStalk = new CornStalk();
        cropRow.add(cornStalk);
        Assert.assertTrue(cropRow.getCrops().contains(cornStalk));
    }

    @Test
    public void testRemoveCrop() {
        CornCropRow cropRow = new CornCropRow();
        CornStalk cornStalk = new CornStalk();
        cropRow.add(cornStalk);
        cropRow.remove(cornStalk);
        Assert.assertFalse(cropRow.getCrops().contains(cornStalk));
    }

    @Test
    public void testRemoveCropDecreasesSize() {
        CornCropRow cropRow = new CornCropRow();
        CornStalk cornStalk = new CornStalk();
        cropRow.add(cornStalk);
        cropRow.remove(cornStalk);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testPlantAddsCropToRow() {
        CornCropRow cropRow = new CornCropRow();
        CornStalk cornStalk = new CornStalk();
        cropRow.plant(cornStalk);
        Assert.assertTrue(cropRow.getCrops().size() > 0);
    }

    @Test
    public void testFertilizeSetsHasBeenFertilized() {
        CornCropRow cropRow = new CornCropRow();
        CornStalk cornStalk = new CornStalk();
        cropRow.add(cornStalk);
        cropRow.fertilizeCrops();
        Assert.assertTrue(cornStalk.isFertilized());
    }

    @Test
    public void testFertilizeOnEmptyRowDoesNotThrow() {
        CornCropRow cropRow = new CornCropRow();
        cropRow.fertilizeCrops();
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testRemoveCropNotInRowDoesNotThrow() {
        CornCropRow cropRow = new CornCropRow();
        CornStalk cornStalk = new CornStalk();
        cropRow.remove(cornStalk);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }
}
