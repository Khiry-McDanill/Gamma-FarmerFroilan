package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Carrot;
import org.junit.Test;
import org.junit.Assert;

public class CarrotPlantTest {

    @Test
    public void testYieldReturnsNullWhenNotReady() {
        CarrotPlant carrotPlant = new CarrotPlant();
        Assert.assertNull(carrotPlant.yield());
    }

    @Test
    public void testYieldReturnsCarrotWhenFertilizedAndHarvested() {
        CarrotPlant carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenFertilized(true);
        carrotPlant.setHasBeenHarvested(true);
        Assert.assertNotNull(carrotPlant.yield());
    }

    @Test
    public void testYieldReturnsCarrotType() {
        CarrotPlant carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenFertilized(true);
        carrotPlant.setHasBeenHarvested(true);
        Assert.assertTrue(carrotPlant.yield() instanceof Carrot);
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        CarrotPlant carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenFertilized(true);
        Assert.assertNull(carrotPlant.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        CarrotPlant carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenHarvested(true);
        Assert.assertNull(carrotPlant.yield());
    }
}
