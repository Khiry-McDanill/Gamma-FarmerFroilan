package com.zipcodewilmington.froilansfarm;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class SundayTest {

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
        tomatoRow = new TomatoCropRow();
        kaleRow = new KaleCropRow();

        field.addCropRow(cornRow);
        field.addCropRow(tomatoRow);
        field.addCropRow(kaleRow);
        field.addCropRow(new PotatoCropRow());
        field.addCropRow(new CarrotCropRow());

        // 10 Horses across 3 Stables
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

    // --- Sunday: Froilan plants 3 crops ---

    @Test
    public void testFroilanPlantsCornsInRow1() {
        froilan.plant(new CornStalk(), cornRow);
        Assert.assertEquals(1, cornRow.size());
    }

    @Test
    public void testFroilanPlantsTomatoInRow2() {
        froilan.plant(new TomatoPlant(), tomatoRow);
        Assert.assertEquals(1, tomatoRow.size());
    }

    @Test
    public void testFroilanPlantsKaleInRow3() {
        froilan.plant(new KaleRoot(), kaleRow);
        Assert.assertEquals(1, kaleRow.size());
    }

    @Test
    public void testFieldHasFiveCropRows() {
        Assert.assertEquals(5, field.getCropRows().size());
    }
}
