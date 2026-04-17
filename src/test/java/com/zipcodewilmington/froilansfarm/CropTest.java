package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class CropTest {

    @Test
    public void testHasBeenHarvestedDefaultsFalse() {
        Crop<?> crop = new CornStalk();
        Assert.assertFalse(crop.isHasBeenHarvested());
    }

    @Test
    public void testSetHasBeenHarvestedTrue() {
        Crop<?> crop = new CornStalk();
        crop.setHasBeenHarvested(true);
        Assert.assertTrue(crop.isHasBeenHarvested());
    }

    @Test
    public void testSetHasBeenHarvestedFalse() {
        Crop<?> crop = new CornStalk();
        crop.setHasBeenHarvested(true);
        crop.setHasBeenHarvested(false);
        Assert.assertFalse(crop.isHasBeenHarvested());
    }

    @Test
    public void testYieldNullWhenNotFertilizedOrHarvested() {
        Crop<?> crop = new CornStalk();
        Assert.assertNull(crop.yield());
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        Crop<?> crop = new CornStalk();
        crop.setHasBeenFertilized(true);
        Assert.assertNull(crop.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        Crop<?> crop = new CornStalk();
        crop.setHasBeenHarvested(true);
        Assert.assertNull(crop.yield());
    }
}
