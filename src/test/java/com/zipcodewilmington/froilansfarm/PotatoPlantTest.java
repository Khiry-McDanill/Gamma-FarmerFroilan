package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class PotatoPlantTest {

    @Test
    public void testYieldReturnsNullWhenNotReady() {
        PotatoRoot potatoPlant = new PotatoRoot();
        Assert.assertNull(potatoPlant.yield());
    }

    @Test
    public void testYieldReturnsPotatoWhenFertilizedAndHarvested() {
        PotatoRoot potatoPlant = new PotatoRoot();
        potatoPlant.setHasBeenFertilized(true);
        potatoPlant.setHasBeenHarvested(true);
        Assert.assertNotNull(potatoPlant.yield());
    }

    @Test
    public void testYieldReturnsPotatoType() {
        PotatoRoot potatoPlant = new PotatoRoot();
        potatoPlant.setHasBeenFertilized(true);
        potatoPlant.setHasBeenHarvested(true);
        Assert.assertTrue(potatoPlant.yield() instanceof Potato);
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        PotatoRoot potatoPlant = new PotatoRoot();
        potatoPlant.setHasBeenFertilized(true);
        Assert.assertNull(potatoPlant.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        PotatoRoot potatoPlant = new PotatoRoot();
        potatoPlant.setHasBeenHarvested(true);
        Assert.assertNull(potatoPlant.yield());
    }
}
