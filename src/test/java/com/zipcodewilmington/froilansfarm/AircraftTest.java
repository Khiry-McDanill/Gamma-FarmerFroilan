package com.zipcodewilmington.froilansfarm;
import org.junit.Test;
public class AircraftTest implements Aircraft {


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
        Aircraft ta = new TestAircraft();
        ta.flies();
    }

    

    @Test
    public void testFertilizesCropRow() {
        TestAircraft ta = new TestAircraft();
        ta.fertilizesCropRow();
    }
