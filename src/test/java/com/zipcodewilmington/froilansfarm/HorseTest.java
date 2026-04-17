package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void testHorseIsNotNull() {
        Horse horse = new Horse("Sparty");
        Assert.assertNotNull(horse);
    }

    @Test
    public void testHorseGetName() {
        Horse horse = new Horse("Sparty");
        Assert.assertEquals("Sparty", horse.getName());
    }

    @Test
    public void testHorseIsNotMountedByDefault() {
        Horse horse = new Horse("Sparty");
        Assert.assertFalse(horse.isMounted());
    }

    @Test
    public void testHorseCanBeMounted() {
        Horse horse = new Horse("Sparty");
        horse.setMounted(true);
        Assert.assertTrue(horse.isMounted());
    }

    @Test
    public void testHorseCanBeDismounted() {
        Horse horse = new Horse("Sparty");
        horse.setMounted(true);
        horse.setMounted(false);
        Assert.assertFalse(horse.isMounted());
    }

    @Test
    public void testHorseHasNotBeenFedByDefault() {
        Horse horse = new Horse("Sparty");
        Assert.assertFalse(horse.hasBeenFed());
    }

    @Test
    public void testHorseCanEat() {
        Horse horse = new Horse("Sparty");
        horse.eat(new Carrot());
        Assert.assertTrue(horse.hasBeenFed());
    }

    @Test
    public void testHorseMakesNoise() {
        Horse horse = new Horse("Sparty");
        Assert.assertEquals("Neeeeighhhhh", horse.makeNoise());
    }
}
