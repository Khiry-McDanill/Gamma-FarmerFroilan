package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void testHorseName() {
        Horse horse = new Horse("mimi");
        assertEquals("mimi", horse.getName());
    }

    @Test
    public void testHorseStartsNotFed() {
        Horse horse = new Horse("mimi");
        assertFalse(horse.hasBeenFed());
}
    @Test
    public void testHorseCanEat() {
        Horse horse = new Horse("mimi");
        horse.eat(new EarCorn());
        assertTrue(horse.hasBeenFed());
    }

    @Test
    public void testHorseCanMakeNoise() {
        Horse horse = new Horse("mimi");
        assertEquals("Neeeeighhhhh", horse.makeNoise());
    }

    @Test
    public void testChickenMakeNoise() {
        Chicken chicken = new Chicken("clucky");
        assertEquals("Cluck cluck", chicken.makeNoise());
    }

    @Test
    public void testToString() {
        Horse horse = new Horse("mimi");
        assertEquals("Horse named mimi", horse.toString());
    }

}
