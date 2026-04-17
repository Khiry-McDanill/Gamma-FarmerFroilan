package com.zipcodewilmington.froilansfarm;
import org.junit.Test;
import static org.junit.Assert.*;



public class PersonTest {
    //makes noise
    //eats
    //this doesnt extens from animal, they just share interfaces.
    //has a name
   @Test
   public void testFarmerName() {
    Farmer froilan = new Farmer("Froilan");
    assertEquals("Froilan", froilan.getName());
   }

   @Test 
   public void testFarmerMakesNoise() {
    Farmer froilan = new Farmer("Froilan");
    assertEquals("YeeHaw", froilan.makeNoise());
   }

   @Test 
    public void testFarmerEats() {
     Farmer froilan = new Farmer("Froilan");
     froilan.eat(new EarCorn());
     assertTrue(froilan.hasBeenFed());
    }

    @Test
    //ridehorsetest
    public void testFarmerRidesHorse() {
        Farmer froilan = new Farmer("Froilan");
        Horse horse = new Horse("pony");

        froilan.mount(horse);
        assertTrue(horse.isMounted());

        froilan.dismount(horse);
        assertFalse(horse.isMounted());
    }

    @Test

    public void testFarmerRides10Horses() {
        Farmer froilan = new Farmer("Froilan");
        for (int i = 0; i < 10; i++) {
            Horse horse = new Horse("Horse " + i);
            froilan.mount(horse);
            assertTrue(horse.isMounted());
            froilan.dismount(horse);
            assertFalse(horse.isMounted());
        }
    }
}
