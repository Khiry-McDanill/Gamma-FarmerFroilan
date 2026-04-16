package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Tomato;
import org.junit.Test;
import org.junit.Assert;

public class TomatoPlantTest {

    @Test
    public void testYieldReturnsNullWhenNotReady() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        Assert.assertNull(tomatoPlant.yield());
    }

    @Test
    public void testYieldReturnsTomatoWhenFertilizedAndHarvested() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setHasBeenHarvested(true);
        Assert.assertNotNull(tomatoPlant.yield());
    }

    @Test
    public void testYieldReturnsTomatoType() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setHasBeenHarvested(true);
        Assert.assertTrue(tomatoPlant.yield() instanceof Tomato);
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        Assert.assertNull(tomatoPlant.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenHarvested(true);
        Assert.assertNull(tomatoPlant.yield());
    }
}
