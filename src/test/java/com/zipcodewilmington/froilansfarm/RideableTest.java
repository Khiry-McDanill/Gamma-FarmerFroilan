package com.zipcodewilmington.froilansfarm;
import org.junit.Test;

public class RideableTest {



    Rideable rideable = new Rideable() {
        @Override
        public void mount() {
        System.out.println("Mounted!");
        }

        @Override
        public void dismount() {
            System.out.println("Dismounted");
        }
    };

    @Test
    public void testMount() {
        rideable.mount();
    }

    @Test
    public void testDismount() {
        rideable.dismount(); 

    }
}
