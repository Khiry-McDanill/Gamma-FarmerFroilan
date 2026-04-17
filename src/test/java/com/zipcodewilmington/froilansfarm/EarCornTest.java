package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class EarCornTest {

    @Test
    public void testEarCornIsNotNull() {
        EarCorn earCorn = new EarCorn();
        Assert.assertNotNull(earCorn);
    }

    @Test
    public void testEarCornImplementsEdible() {
        EarCorn earCorn = new EarCorn();
        Assert.assertTrue(earCorn instanceof Edible);
    }
}
