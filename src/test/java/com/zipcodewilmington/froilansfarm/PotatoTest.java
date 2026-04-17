package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class PotatoTest {

    @Test
    public void testPotatoIsNotNull() {
        Potato potato = new Potato();
        Assert.assertNotNull(potato);
    }

    @Test
    public void testPotatoImplementsEdible() {
        Potato potato = new Potato();
        Assert.assertTrue(potato instanceof Edible);
    }
}
