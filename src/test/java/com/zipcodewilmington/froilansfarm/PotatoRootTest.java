package com.zipcodewilmington.froilansfarm;


import org.junit.Assert;
import org.junit.Test;

public class PotatoRootTest {

    @Test
    public void testYieldReturnsNullWhenNotReady() {
        PotatoRoot potatoRoot = new PotatoRoot();
        Assert.assertNull(potatoRoot.yield());
    }

    @Test
    public void testYieldReturnsPotatoWhenFertilizedAndHarvested() {
        PotatoRoot potatoRoot = new PotatoRoot();
        potatoRoot.setHasBeenFertilized(true);
        potatoRoot.setHasBeenHarvested(true);
        Assert.assertNotNull(potatoRoot.yield());
    }

    @Test
    public void testYieldReturnsPotatoType() {
        PotatoRoot potatoRoot = new PotatoRoot();
        potatoRoot.setHasBeenFertilized(true);
        potatoRoot.setHasBeenHarvested(true);
        Assert.assertTrue(potatoRoot.yield() instanceof Potato);
    }

    @Test
    public void testYieldNullWhenOnlyFertilized() {
        PotatoRoot potatoRoot = new PotatoRoot();
        potatoRoot.setHasBeenFertilized(true);
        Assert.assertNull(potatoRoot.yield());
    }

    @Test
    public void testYieldNullWhenOnlyHarvested() {
        PotatoRoot potatoRoot = new PotatoRoot();
        potatoRoot.setHasBeenHarvested(true);
        Assert.assertNull(potatoRoot.yield());
    }
}
