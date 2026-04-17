package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import static org.junit.Assert.*;

public class FarmTest {

    @Test
    public void testFarmIsNotNull() {
        Farm farm = new Farm();
        assertNotNull(farm);
    }

    @Test
    public void testFarmHasAFarmHouse() {
        Farm farm = new Farm();
        assertNotNull(farm.getFarmHouse());
    }

    @Test
    public void testFarmHasAField() {
        Farm farm = new Farm();
        assertNotNull(farm.getField());
    }

    @Test
    public void testAddStable() {
        Farm farm = new Farm();
        farm.addStable(new Stable());
        assertEquals(1, farm.getStables().size());
    }

    @Test
    public void testAddChickenCoop() {
        Farm farm = new Farm();
        farm.addChickenCoop(new ChickenCoop());
        assertEquals(1, farm.getChickenCoops().size());
    }
}
