package com.zipcodewilmington.froilansfarm;
import org.junit.Test;

public class FarmVehicleTest {


    class TestFarmVehicle implements FarmVehicle {
        public void operatesOnFarm() {
            System.out.println("Operating on the farm");
        }
    }

    @Test
    public void testOperatorOnFarm() {
        TestFarmVehicle tfv = new TestFarmVehicle();
        tfv.operatesOnFarm();
    }
}
