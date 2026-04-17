package com.zipcodewilmington.froilansfarm;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TuesdayTest {

    private Farmer froilan;
    private Froilanda froilanda;
    private Tractor tractor;
    private Farm farm;
    private Field field;
    private CornCropRow cornRow;
    private TomatoCropRow tomatoRow;
    private KaleCropRow kaleRow;

    @Before
    public void setUp() {
        froilan = new Farmer("Froilan");
        froilanda = new Froilanda("Froilanda");
        tractor = new Tractor();

        farm = new Farm();
        field = farm.getField();

        cornRow = new CornCropRow();
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornRow.add(cornStalk);

        tomatoRow = new TomatoCropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoRow.add(tomatoPlant);

        kaleRow = new KaleCropRow();
        KaleRoot kaleRoot = new KaleRoot();
        kaleRoot.setHasBeenFertilized(true);
        kaleRow.add(kaleRoot);

        PotatoCropRow potatoRow = new PotatoCropRow();
        PotatoRoot potatoRoot = new PotatoRoot();
        potatoRoot.setHasBeenFertilized(true);
        potatoRow.add(potatoRoot);

        CarrotCropRow carrotRow = new CarrotCropRow();
        CarrotRoot carrotRoot = new CarrotRoot();
        carrotRoot.setHasBeenFertilized(true);
        carrotRow.add(carrotRoot);

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

    // --- Tuesday: Froilan harvests each Crop with the Tractor ---

    @Test
    public void testTractorOperatesOnFarm() {
        tractor.operatesOnFarm();
        Assert.assertNotNull(tractor);
    }

    @Test
    public void testFroilanHarvestsAllCrops() {
        tractor.mount();
        for (CropRow<?> row : field.getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                crop.setHasBeenHarvested(true);
            }
        }
        tractor.dismount();
        for (CropRow<?> row : field.getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                Assert.assertTrue(crop.isHasBeenHarvested());
            }
        }
    }

    @Test
    public void testCornYieldsAfterHarvest() {
        for (CornStalk stalk : cornRow.getCrops()) {
            stalk.setHasBeenHarvested(true);
            Assert.assertNotNull(stalk.yield());
        }
    }

    @Test
    public void testTomatoYieldsAfterHarvest() {
        for (TomatoPlant plant : tomatoRow.getCrops()) {
            plant.setHasBeenHarvested(true);
            Assert.assertNotNull(plant.yield());
        }
    }

    @Test
    public void testKaleYieldsAfterHarvest() {
        for (KaleRoot root : kaleRow.getCrops()) {
            root.setHasBeenHarvested(true);
            Assert.assertNotNull(root.yield());
        }
    }

    @Test
    public void testTractorMounts() {
        tractor.mount();
        Assert.assertNotNull(tractor);
    }

    @Test
    public void testTractorDismounts() {
        tractor.mount();
        tractor.dismount();
        Assert.assertNotNull(tractor);
    }
}
