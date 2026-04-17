package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class CarrotPlantTest {

    @Test
    public void testYieldReturnsNullWhenNotReady() {
        CarrotRoot carrotPlant = new CarrotRoot();
        Assert.assertNull(carrotPlant.yield());
    }

    @Test
    public void testYieldReturnsCarrotWhenFertilizedAndHarvested() {
        CarrotRoot carrotPlant = new CarrotRoot();
        carrotPlant.setHasBeenFertilized(true);
        carrotPlant.setHasBeenHarvested(true);
        Assert.assertNotNull(carrotPlant.yield());
    }

    @Test
    public void testYieldReturnsCarrotType() {
        CarrotRoot carrotPlant = new CarrotRoot();
        carrotPlant.setHasBeenFertilized(true);
        carrotPlant.setHasBeenHarvested(true);
        Assert.assertTrue(carrotPlant.yield() instanceof Carrot);
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        CarrotRoot carrotPlant = new CarrotRoot();
        carrotPlant.setHasBeenFertilized(true);
        Assert.assertNull(carrotPlant.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        CarrotRoot carrotPlant = new CarrotRoot();
        carrotPlant.setHasBeenHarvested(true);
        Assert.assertNull(carrotPlant.yield());
    }
}
