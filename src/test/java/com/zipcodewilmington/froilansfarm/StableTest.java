package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import static org.junit.Assert.*;

public class StableTest {

    @Test
    public void testStableStartsEmpty() {
        Stable stable = new Stable();
        assertTrue(stable.isEmpty());
    }

    @Test
    public void testAddHorse() {
        Stable stable = new Stable();
        Horse horse = new Horse("Sparty");
        stable.add(horse);
        assertEquals(1, stable.size());
    }

    @Test
    public void testGetHorse() {
        Stable stable = new Stable();
        Horse horse = new Horse("Sparty");
        stable.add(horse);
        assertEquals(horse, stable.get(0));
    }

    @Test
    public void testRemoveHorse() {
        Stable stable = new Stable();
        Horse horse = new Horse("Sparty");
        stable.add(horse);
        stable.remove(horse);
        assertTrue(stable.isEmpty());
    }

    @Test
    public void testGetHorses() {
        Stable stable = new Stable();
        stable.add(new Horse("Sparty"));
        stable.add(new Horse("Mimi"));
        assertEquals(2, stable.getHorses().size());
    }
}
