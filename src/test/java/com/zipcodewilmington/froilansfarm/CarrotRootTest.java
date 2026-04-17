package com.zipcodewilmington.froilansfarm;


import org.junit.Assert;
import org.junit.Test;

public class CarrotRootTest {

    @Test
    public void testYieldReturnsNullWhenNotReady() {
        CarrotRoot carrotRoot = new CarrotRoot();
        Assert.assertNull(carrotRoot.yield());
    }

    @Test
    public void testYieldReturnsCarrotWhenFertilizedAndHarvested() {
        CarrotRoot carrotRoot = new CarrotRoot();
        carrotRoot.setHasBeenFertilized(true);
        carrotRoot.setHasBeenHarvested(true);
        Assert.assertNotNull(carrotRoot.yield());
    }

    @Test
    public void testYieldReturnsCarrotType() {
        CarrotRoot carrotRoot = new CarrotRoot();
        carrotRoot.setHasBeenFertilized(true);
        carrotRoot.setHasBeenHarvested(true);
        Assert.assertTrue(carrotRoot.yield() instanceof Carrot);
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        CarrotRoot carrotRoot = new CarrotRoot();
        carrotRoot.setHasBeenFertilized(true);
        Assert.assertNull(carrotRoot.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        CarrotRoot carrotRoot = new CarrotRoot();
        carrotRoot.setHasBeenHarvested(true);
        Assert.assertNull(carrotRoot.yield());
    }
}
