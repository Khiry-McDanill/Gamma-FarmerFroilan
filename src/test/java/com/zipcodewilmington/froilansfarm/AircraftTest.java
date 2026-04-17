package com.zipcodewilmington.froilansfarm;

import java.beans.Transient;
import org.junit.Test;
public class AircraftTest {

    class TestAircraft implements Aircraft {
        public void flies() {
            System.out.println("Aircraft flies");
        }
        public void fertilizesCropRow() {
            System.out.println("Aircraft is fertilizing the crop row!");

        }
    }

    @Transientpublic void testFlies() {
        TestAircraft ta = new TestAircraft();
        ta.flies();
    }

    

    @Test
    public void testFertilizesCropRow() {
        TestAircraft ta = new TestAircraft();
        ta.fertilizesCropRow();
    }


}
