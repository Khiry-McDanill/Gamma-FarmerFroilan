package com.zipcodewilmington.froilansfarm;
import org.junit.Test;
import java.beans.Transient;

public class TractorTest {

    @Test
    public void testTractorIsRideable(){
        Tractor tractor = new Tractor();
        tractor.harvestCrop();
    }
  @Test
    public void testOperatesOnFarm() {
        Tractor tractor = new Tractor();
        tractor.operatesOnFarm();
    }

    @Test
    public void testMakeNoise() {
        Tractor tractor = new Tractor();
        tractor.makeNoise();
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
 

