package com.zipcodewilmington.froilansfarm;


import org.junit.Test;
public class AircraftTest {

    class TestAircraft implements Aircraft {

    @Test
        public void flies() {
            System.out.println("Aircraft flies");
        }
    @Test
        public void fertilizesCropRow() {
        System.out.println("Aircraft is fertilizing the crop row!");

        }
    }

    @Test
    public void testFlies() {
        TestAircraft ta = new TestAircraft();
        ta.flies();
    }

    

    @Test
    public void testFertilizesCropRow() {
        TestAircraft ta = new TestAircraft();
        ta.fertilizesCropRow();
    }


}
