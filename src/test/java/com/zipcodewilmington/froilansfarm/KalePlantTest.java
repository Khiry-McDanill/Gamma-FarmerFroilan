package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class KalePlantTest {

    @Test
    public void testYieldReturnsNullWhenNotReady() {
        KalePlant kalePlant = new KalePlant();
        Assert.assertNull(kalePlant.yield());
    }

    @Test
    public void testYieldReturnsKaleWhenFertilizedAndHarvested() {
        KalePlant kalePlant = new KalePlant();
        kalePlant.setHasBeenFertilized(true);
        kalePlant.setHasBeenHarvested(true);
        Assert.assertNotNull(kalePlant.yield());
    }

    @Test
    public void testYieldReturnsKaleType() {
        KalePlant kalePlant = new KalePlant();
        kalePlant.setHasBeenFertilized(true);
        kalePlant.setHasBeenHarvested(true);
        Assert.assertTrue(kalePlant.yield() instanceof Kale);
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        KalePlant kalePlant = new KalePlant();
        kalePlant.setHasBeenFertilized(true);
        Assert.assertNull(kalePlant.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        KalePlant kalePlant = new KalePlant();
        kalePlant.setHasBeenHarvested(true);
        Assert.assertNull(kalePlant.yield());
    }
}
