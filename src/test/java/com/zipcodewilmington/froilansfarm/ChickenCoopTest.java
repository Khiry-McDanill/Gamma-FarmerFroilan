package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChickenCoopTest {

    @Test
    public void testChickenCoopStartsEmpty() {
        ChickenCoop coop = new ChickenCoop();
        assertTrue(coop.isEmpty());
    }

    @Test
    public void testAddChicken() {
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken("Henrietta");
        coop.add(chicken);
        assertEquals(1, coop.size());
    }

    @Test
    public void testGetChicken() {
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken("Henrietta");
        coop.add(chicken);
        assertEquals(chicken, coop.get(0));
    }

    @Test
    public void testRemoveChicken() {
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken("Henrietta");
        coop.add(chicken);
        coop.remove(chicken);
        assertTrue(coop.isEmpty());
    }

    @Test
    public void testGetChickens() {
        ChickenCoop coop = new ChickenCoop();
        coop.add(new Chicken("Henrietta"));
        coop.add(new Chicken("Clucky"));
        assertEquals(2, coop.getChickens().size());
    }
}
