package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

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
}
