package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import static org.junit.Assert.*;

public class FarmHouseTest {

    @Test
    public void testConstructorName() {
        FarmHouse farmHouse = new FarmHouse();
        String name = farmHouse.getName();
        assertEquals("Farm House", name);
    }

    @Test
    public void testAddPerson() {
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Farmer("Test");

        boolean added = farmHouse.add(person);
        assertTrue(added);
        assertEquals(1, farmHouse.size());
    }

    @Test
    public void testGetPerson() {
        FarmHouse farmHouse = new FarmHouse();
        Person p = new Farmer("Test");
        farmHouse.add(p);

        Person result = farmHouse.get(0);
        assertEquals(p, result);
    }

    @Test
    public void testIsEmptyInitially() {
        FarmHouse farmHouse = new FarmHouse();
        assertTrue(farmHouse.isEmpty());
    }

    @Test
    public void testClearFarmHouse() {
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(new Farmer("Test1"));
        farmHouse.add(new Farmer("Test2"));

        farmHouse.clear();

        assertTrue(farmHouse.isEmpty());
        assertEquals(0, farmHouse.size());
    }

    @Test
    public void testCapacityLimit() {
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.setCapacity(1);
        Person p1 = new Farmer("Test1");
        Person p2 = new Farmer("Test2");

        boolean firstAdded = farmHouse.add(p1);
        boolean secondAdded = farmHouse.add(p2);

        assertTrue(firstAdded);
        assertFalse(secondAdded);
        assertEquals(1, farmHouse.size());
        assertTrue(farmHouse.isFull());
    }
}
