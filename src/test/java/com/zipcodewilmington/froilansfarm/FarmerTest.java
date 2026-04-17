package com.zipcodewilmington.froilansfarm;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FarmerTest {
    @Test
    public void testFarmerName() {
        Farmer froilan = new Farmer("Froilan");
        assertsEquals("Froilan", froilan.getName());
    }

    @Test
    public void testFarmerMakesNoise() {
        Farmer froilan = new Farmer("Froilan");
        assertsEquals("Froilan says yo", froilan.makesNoise());
    }

    @Test
    public void testFarmerCanEat() {
        Farmer froilan = new Farmer("Froilan");
        froilan.eat( new EarCorn);
        assertTrue(froilan.hasBeedFed());
    }

    @Test
    public void testFarmerCanRideHorse() {
        Farmer froilan = new Farmer("Froilan");
        Horse horse = new Horse("sparty");

        froilan.mount(horse);
        froilan.dismount(horse);

        assertFalse(horse.isMounted());
        assertFalse(froilan.isRiding());
    }

    @Test
    public void testFarmerRides10Horses() {
        Farmer froilan = new Farmer("Froilan");

        for (int i = 0; i < 10; i++) {
            Horse horse = new Horse("Horse" + i);
            froilan.mount(horse);
            assertTrue(horse.isMounted());
            froilan.dismount(horse);
        }
    }
    @Test
    public void testFarmerEatsBreakfast() {
        Farmer froilan = new Farmer("Froilan");

        froilan.eat(new EarCorn());
        froilan.eat(new Tomato());
        froilan.eat(new Tomato());
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        
        assertTrue(froilan.hasBeenFed());
    }

    @Test
    public void testFarmerCanPlant() {
        Farmer froilan = new Farmer("Froilan");
        CropRow cropRow = new CropRow();
        
        froilan.plant(new CornStalk(), cropRow);
        froilan.plant(new CornStalk(), cropRow);

        assertEquals(2, cropRow.size());
    }
}