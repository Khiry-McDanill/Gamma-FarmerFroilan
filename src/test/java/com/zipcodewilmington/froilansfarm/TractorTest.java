package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void testTractorIsNotNull() {
        Tractor tractor = new Tractor();
        Assert.assertNotNull(tractor);
    }

    @Test
    public void testTractorIsRideable() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor.isRideable());
    }

    @Test
    public void testTractorImplementsFarmVehicle() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }

    @Test
    public void testTractorImplementsRideable() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Rideable);
    }
}
