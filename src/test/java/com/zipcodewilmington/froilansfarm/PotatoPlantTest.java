package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Potato;
import org.junit.Test;
import org.junit.Assert;

public class PotatoPlantTest {

    @Test
    public void testYieldReturnsNullWhenNotReady() {
        PotatoPlant potatoPlant = new PotatoPlant();
        Assert.assertNull(potatoPlant.yield());
    }

    @Test
    public void testYieldReturnsPotatoWhenFertilizedAndHarvested() {
        PotatoPlant potatoPlant = new PotatoPlant();
        potatoPlant.setHasBeenFertilized(true);
        potatoPlant.setHasBeenHarvested(true);
        Assert.assertNotNull(potatoPlant.yield());
    }

    @Test
    public void testYieldReturnsPotatoType() {
        PotatoPlant potatoPlant = new PotatoPlant();
        potatoPlant.setHasBeenFertilized(true);
        potatoPlant.setHasBeenHarvested(true);
        Assert.assertTrue(potatoPlant.yield() instanceof Potato);
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        PotatoPlant potatoPlant = new PotatoPlant();
        potatoPlant.setHasBeenFertilized(true);
        Assert.assertNull(potatoPlant.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        PotatoPlant potatoPlant = new PotatoPlant();
        potatoPlant.setHasBeenHarvested(true);
        Assert.assertNull(potatoPlant.yield());
    }
}
