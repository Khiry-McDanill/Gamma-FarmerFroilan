package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class CropTest {

    @Test
    public void testHasBeenHarvestedDefaultsFalse() {
        CornStalk crop = new CornStalk();
        Assert.assertFalse(crop.isHasBeenHarvested());
    }

    @Test
    public void testSetHasBeenHarvestedTrue() {
        CornStalk crop = new CornStalk();
        crop.setHasBeenHarvested(true);
        Assert.assertTrue(crop.isHasBeenHarvested());
    }

    @Test
    public void testSetHasBeenHarvestedFalse() {
        CornStalk crop = new CornStalk();
        crop.setHasBeenHarvested(true);
        crop.setHasBeenHarvested(false);
        Assert.assertFalse(crop.isHasBeenHarvested());
    }

    @Test
    public void testYieldNullWhenNotFertilizedOrHarvested() {
        CornStalk crop = new CornStalk();
        Assert.assertNull(crop.yield());
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        CornStalk crop = new CornStalk();
        crop.setHasBeenFertilized(true);
        Assert.assertNull(crop.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        CornStalk crop = new CornStalk();
        crop.setHasBeenHarvested(true);
        Assert.assertNull(crop.yield());
    }
}
