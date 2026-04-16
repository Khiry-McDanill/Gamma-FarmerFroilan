package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class PotatoCropRowTest {

    @Test
    public void testAddCrop() {
        PotatoCropRow cropRow = new PotatoCropRow();
        PotatoRoot potatoRoot = new PotatoRoot();
        cropRow.add(potatoRoot);
        Assert.assertTrue(cropRow.getCrops().contains(potatoRoot));
    }

    @Test
    public void testRemoveCrop() {
        PotatoCropRow cropRow = new PotatoCropRow();
        PotatoRoot potatoRoot = new PotatoRoot();
        cropRow.add(potatoRoot);
        cropRow.remove(potatoRoot);
        Assert.assertFalse(cropRow.getCrops().contains(potatoRoot));
    }

    @Test
    public void testRemoveCropDecreasesSize() {
        PotatoCropRow cropRow = new PotatoCropRow();
        PotatoRoot potatoRoot = new PotatoRoot();
        cropRow.add(potatoRoot);
        cropRow.remove(potatoRoot);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testPlantAddsCropToRow() {
        PotatoCropRow cropRow = new PotatoCropRow();
        PotatoRoot potatoRoot = new PotatoRoot();
        cropRow.plant(potatoRoot);
        Assert.assertTrue(cropRow.getCrops().size() > 0);
    }

    @Test
    public void testFertilizeSetsHasBeenFertilized() {
        PotatoCropRow cropRow = new PotatoCropRow();
        PotatoRoot potatoRoot = new PotatoRoot();
        cropRow.add(potatoRoot);
        cropRow.fertilizeCrops();
        Assert.assertTrue(potatoRoot.isFertilized());
    }

    @Test
    public void testFertilizeOnEmptyRowDoesNotThrow() {
        PotatoCropRow cropRow = new PotatoCropRow();
        cropRow.fertilizeCrops();
        Assert.assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testRemoveCropNotInRowDoesNotThrow() {
        PotatoCropRow cropRow = new PotatoCropRow();
        PotatoRoot potatoRoot = new PotatoRoot();
        cropRow.remove(potatoRoot);
        Assert.assertEquals(0, cropRow.getCrops().size());
    }
}
