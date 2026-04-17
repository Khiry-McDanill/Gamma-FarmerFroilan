package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertTrue(horse.hasBeeenFed());
    }

    @Test
    public void testHorseCanMakeNoise() {
        Horse horse = new Horse("mimi");
        assertEquals("Neeeeighhhhh", horse.makeNoise);
    }

    

    @Test
    public void testToString() {
        Horse horse = new Horse("mimi");
        assertEquals("Horse naed mimi", horse.toString());
    }

}
