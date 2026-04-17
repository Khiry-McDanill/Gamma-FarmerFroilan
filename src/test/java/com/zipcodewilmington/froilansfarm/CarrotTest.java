package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CarrotTest {

    @Test
    public void testCarrotIsNotNull() {
        Carrot carrot = new Carrot();
        Assert.assertNotNull(carrot);
    }

    @Test
    public void testCarrotImplementsEdible() {
        Carrot carrot = new Carrot();
        Assert.assertTrue(carrot instanceof Edible);
    }
}
