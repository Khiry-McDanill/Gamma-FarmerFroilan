package com.zipcodewilmington.froilansfarm;


import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    @Test
    public void testYieldReturnsNullWhenNotReady() {
        CornStalk cornStalk = new CornStalk();
        Assert.assertNull(cornStalk.yield());
    }

    @Test
    public void testYieldReturnsEarCornWhenFertilizedAndHarvested() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setHasBeenHarvested(true);
        Assert.assertNotNull(cornStalk.yield());
    }

    @Test
    public void testYieldReturnsEarCornType() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setHasBeenHarvested(true);
        Assert.assertTrue(cornStalk.yield() instanceof EarCorn);
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        Assert.assertNull(cornStalk.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenHarvested(true);
        Assert.assertNull(cornStalk.yield());
    }
}
