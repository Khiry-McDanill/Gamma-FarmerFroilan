package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import static org.junit.Assert.*;

public class BotanistTest {
    @Test
    public void testBotanistName() {
        Botanist botanist = new Botanist("Froilan");
        assertEquals("Froilan", botanist.getName());
    }

    @Test
    public void testBotanistMakesNoise() {
        Botanist botanist = new Botanist("Froilan");
        assertEquals("I know plants!", botanist.makeNoise());
    }

    @Test
    public void testBotanistCanEat() {
        Botanist botanist = new Botanist("Froilan");
        botanist.eat(new EarCorn());
        assertTrue(botanist.hasBeenFed());
    }

    @Test
    public void testBotanistCanPlant() {
        Botanist botanist = new Botanist("Froilan");
        CornCropRow cropRow = new CornCropRow();

        botanist.plant(new CornStalk(), cropRow);
        botanist.plant(new CornStalk(), cropRow);

        assertEquals(2, cropRow.size());
    }

    @Test
    public void testBotanistCanFertilize() {
        Botanist botanist = new Botanist("Froilan");
        CornCropRow cropRow = new CornCropRow();

        cropRow.add(new CornStalk());
        cropRow.add(new CornStalk());
        botanist.fertilize(cropRow);

        cropRow.getCrops().forEach(crop -> assertTrue(crop.isFertilized()));
    }
}
