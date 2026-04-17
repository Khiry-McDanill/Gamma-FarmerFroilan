package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class KaleTest {

    @Test
    public void testKaleIsNotNull() {
        Kale kale = new Kale();
        Assert.assertNotNull(kale);
    }

    @Test
    public void testKaleImplementsEdible() {
        Kale kale = new Kale();
        Assert.assertTrue(kale instanceof Edible);
    }
}
