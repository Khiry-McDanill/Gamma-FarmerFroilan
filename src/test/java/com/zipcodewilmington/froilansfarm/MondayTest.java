package com.zipcodewilmington.froilansfarm;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MondayTest {

    private Farmer froilan;
    private Froilanda froilanda;
    private Farm farm;
    private Field field;
    private CornCropRow cornRow;
    private TomatoCropRow tomatoRow;
    private KaleCropRow kaleRow;

    @Before
    public void setUp() {
        froilan = new Farmer("Froilan");
        froilanda = new Froilanda("Froilanda");

        farm = new Farm();
        field = farm.getField();

        cornRow = new CornCropRow();
        cornRow.add(new CornStalk());

        tomatoRow = new TomatoCropRow();
        tomatoRow.add(new TomatoPlant());

        kaleRow = new KaleCropRow();
        kaleRow.add(new KaleRoot());

        PotatoCropRow potatoRow = new PotatoCropRow();
        potatoRow.add(new PotatoRoot());

        CarrotCropRow carrotRow = new CarrotCropRow();
        carrotRow.add(new CarrotRoot());

        field.addCropRow(cornRow);
        field.addCropRow(tomatoRow);
        field.addCropRow(kaleRow);
        field.addCropRow(potatoRow);
        field.addCropRow(carrotRow);

        int[] horseCounts = {4, 3, 3};
        int num = 1;
        for (int count : horseCounts) {
            Stable stable = new Stable();
            for (int i = 0; i < count; i++) {
                stable.add(new Horse("Horse" + num++));
            }
            farm.addStable(stable);
        }
    }

    // --- Morning Routine ---

    @Test
    public void testFroilanRidesEachHorse() {
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getHorses()) {
                froilan.mount(horse);
                Assert.assertTrue(horse.isMounted());
                froilan.dismount(horse);
                Assert.assertFalse(horse.isMounted());
            }
        }
    }

    @Test
    public void testEachHorseFedThreeEarCorn() {
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getHorses()) {
                horse.eat(new EarCorn());
                horse.eat(new EarCorn());
                horse.eat(new EarCorn());
                Assert.assertTrue(horse.hasBeenFed());
            }
        }
    }

    @Test
    public void testFroilanEatsBreakfast() {
        froilan.eat(new EarCorn());
        froilan.eat(new Tomato());
        froilan.eat(new Tomato());
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        Assert.assertTrue(froilan.hasBeenFed());
    }

    @Test
    public void testFroilandaEatsBreakfast() {
        froilanda.eat(new EarCorn());
        froilanda.eat(new EarCorn());
        froilanda.eat(new Tomato());
        froilanda.eat(new Egg(false));
        froilanda.eat(new Egg(false));
        Assert.assertTrue(froilanda.hasBeenFed());
    }

    // --- Monday: Froilanda fertilizes each CropRow ---

    @Test
    public void testFroilandaFertilizesField() {
        froilanda.fertilizeField(field);
        for (CropRow<?> row : field.getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                Assert.assertTrue(crop.isFertilized());
            }
        }
    }

    @Test
    public void testCropDusterFliesOverField() {
        Assert.assertNotNull(froilanda.getCropDuster());
        froilanda.fly();
    }

    @Test
    public void testAllCornFertilized() {
        froilanda.fertilizeField(field);
        for (CornStalk stalk : cornRow.getCrops()) {
            Assert.assertTrue(stalk.isFertilized());
        }
    }

    @Test
    public void testAllTomatoesFertilized() {
        froilanda.fertilizeField(field);
        for (TomatoPlant plant : tomatoRow.getCrops()) {
            Assert.assertTrue(plant.isFertilized());
        }
    }

    @Test
    public void testAllKaleFertilized() {
        froilanda.fertilizeField(field);
        for (KaleRoot root : kaleRow.getCrops()) {
            Assert.assertTrue(root.isFertilized());
        }
    }
}
