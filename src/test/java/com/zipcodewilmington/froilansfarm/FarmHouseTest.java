package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FarmHouseTest {
@Test
    public void testConstructorName() {

    FarmHouse farmHouse = new FarmHouse();
    String name = farmHouse.getName();
    Assertions.assertEquals("Farm House" , name);
}

@Test
    public void testAddPerson() {
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Farmer(null);

        boolean added = farmHouse.add(person);
        Assertions.assertTrue(added);
        Assertions.assertEquals(1, farmHouse.size());
    }

@Test
    public void testRemovePerson() {
        Farmhouse farmhouse = new Farmhouse();
        Person p = new Farmer(null);
        farmHouse.add(p);

        Person result = farmhouse.get(0);
        Assertions.assertEquals(p, result);
    }

    @Test
    public void testIsEmptyInitially() {
       Farmhouse farmhouse = new Farmhouse(); 
       Assertions.assertEquals(farmHouse.isEmpty);
    }

@Test

    public void testClearFarmHouse() {
       Farmhouse farmhouse = new Farmhouse();
       farmHouse.add(new Farmer(null)); 
       farmHouse.add(new Farmer(null)); 

       farmHouse.clear();

       Assertions.assertTrue(farmHouse.isEmpty());
       Assertions.assertEquals(0,farmHouse.size());
    }

@Test

    public void testcapacityLimit() {
        Farmhouse farmhouse = new Farmhouse();
        farmhouse.setcapacity(1);
        Person p1 = new Farmer(null);
        Person p2 = new Farmer(null);

        boolean firstAdded = farmHouse.add(p1);
        boolean firstAdded = farmHouse.add(p2);

        Assertions.assertTrue(firstAdded);
        Assertions.asserFalse(secondAdded);
        Assertions.assertEquals(1, farmHouse.size());
        Assertions.asserTrue(farmHouse.isFull());
    }
}   