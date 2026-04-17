package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void testChickenIsNotNull() {
        Chicken chicken = new Chicken("Henrietta");
        Assert.assertNotNull(chicken);
    }

    @Test
    public void testChickenGetName() {
        Chicken chicken = new Chicken("Henrietta");
        Assert.assertEquals("Henrietta", chicken.getName());
    }

    @Test
    public void testChickenMakesNoise() {
        Chicken chicken = new Chicken("Henrietta");
        Assert.assertEquals("Cluck cluck", chicken.makeNoise());
    }
}
