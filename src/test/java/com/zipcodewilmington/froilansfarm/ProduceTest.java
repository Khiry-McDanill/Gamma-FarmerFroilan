package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import org.junit.Assert;

public class ProduceTest {

    @Test
    public void testHasBeenFertilizedDefaultsFalse() {
        CornStalk produce = new CornStalk();
        Assert.assertFalse(produce.isHasBeenFertilized());
    }

    @Test
    public void testSetHasBeenFertilizedTrue() {
        CornStalk produce = new CornStalk();
        produce.setHasBeenFertilized(true);
        Assert.assertTrue(produce.isHasBeenFertilized());
    }

    @Test
    public void testSetHasBeenFertilizedFalse() {
        CornStalk produce = new CornStalk();
        produce.setHasBeenFertilized(true);
        produce.setHasBeenFertilized(false);
        Assert.assertFalse(produce.isHasBeenFertilized());
    }
}
