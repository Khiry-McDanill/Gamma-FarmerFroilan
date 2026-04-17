package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class KaleRootTest {

    @Test
    public void testYieldReturnsNullWhenNotReady() {
        KaleRoot kaleRoot = new KaleRoot();
        Assert.assertNull(kaleRoot.yield());
    }

    @Test
    public void testYieldReturnsKaleWhenFertilizedAndHarvested() {
        KaleRoot kaleRoot = new KaleRoot();
        kaleRoot.setHasBeenFertilized(true);
        kaleRoot.setHasBeenHarvested(true);
        Assert.assertNotNull(kaleRoot.yield());
    }

    @Test
    public void testYieldReturnsKaleType() {
        KaleRoot kaleRoot = new KaleRoot();
        kaleRoot.setHasBeenFertilized(true);
        kaleRoot.setHasBeenHarvested(true);
        Assert.assertTrue(kaleRoot.yield() instanceof Kale);
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        KaleRoot kaleRoot = new KaleRoot();
        kaleRoot.setHasBeenFertilized(true);
        Assert.assertNull(kaleRoot.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        KaleRoot kaleRoot = new KaleRoot();
        kaleRoot.setHasBeenHarvested(true);
        Assert.assertNull(kaleRoot.yield());
    }
}
