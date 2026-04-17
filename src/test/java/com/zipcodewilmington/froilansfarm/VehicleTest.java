package com.zipcodewilmington.froilansfarm;

import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void testMakeNoise() {
        Tractor tractor = new Tractor();
        assertEquals("Tractor goes VROOM.", tractor.makeNoise());
    }

    @Test
    public void testIsRideable() {
        Tractor tractor = new Tractor();
        assertTrue(tractor.isRideable());
    }

    @Test
    public void testMount() {
        Tractor tractor = new Tractor();
        tractor.mount();
    }

    @Test
    public void testDismount() {
        Tractor tractor = new Tractor();
        tractor.dismount();
    }
}
