package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {

    @Test
    public void testTomatoIsNotNull() {
        Tomato tomato = new Tomato();
        Assert.assertNotNull(tomato);
    }

    @Test
    public void testTomatoImplementsEdible() {
        Tomato tomato = new Tomato();
        Assert.assertTrue(tomato instanceof Edible);
    }
}
