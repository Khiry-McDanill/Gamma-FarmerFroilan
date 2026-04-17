package com.zipcodewilmington.froilansfarm;


import org.junit.Assert;
import org.junit.Test;

public class EggTest {

    @Test
    public void testEggIsNotNull() {
        Egg egg = new Egg();
        Assert.assertNotNull(egg);
    }

    @Test
    public void testEggImplementsEdible() {
        Egg egg = new Egg();
        Assert.assertTrue(egg instanceof Edible);
    }

    @Test
    public void testUnfertilizedEggIsEdible() {
        Egg egg = new Egg(false);
        Assert.assertTrue(egg.getIsEdible());
    }

    @Test
    public void testFertilizedEggIsNotEdible() {
        Egg egg = new Egg(true);
        Assert.assertFalse(egg.getIsEdible());
    }
}
