package com.zipcodewilmington.froilansfarm;


import org.junit.Assert;
import org.junit.Test;

public class EggTest implements Edible {

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
}
