package com.zipcodewilmington.froilansfarm;
import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest {

    // A simple fake class just for testing
    class TestVehicle extends Vehicle {
        public void makeNoise() {
            System.out.println("Vehicle is making noise!");
        }
        public boolean isRideable() {
            return true;
        }
        public void mount() {
            System.out.println("Mounted the vehicle!");
        }
        public void dismount() {
            System.out.println("Dismounted the vehicle!");
        }
    }

    @Test
    public void testMakeNoise() {
        TestVehicle tv = new TestVehicle();
        tv.makeNoise();
    }

    @Test
    public void testIsRideable() {
        TestVehicle tv = new TestVehicle();
        assertTrue(tv.isRideable());
    }

    @Test
    public void testMount() {
        TestVehicle tv = new TestVehicle();
        tv.mount();
    }

    @Test
    public void testDismount() {
        TestVehicle tv = new TestVehicle();
        tv.dismount();
    }
} 
