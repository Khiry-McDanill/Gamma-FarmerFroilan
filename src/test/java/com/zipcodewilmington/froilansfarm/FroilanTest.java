package com.zipcodewilmington.froilansfarm;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class FroilanTest {

    private Froilan froilan;
    private Farm farm;
    private Field field;
    private CornCropRow cornRow;
    private TomatoCropRow tomatoRow;
    private KaleCropRow kaleRow;

    @Before
    public void setUp() {
        froilan = new Froilan();

        farm = new Farm();
        field = farm.getField();

        cornRow = new CornCropRow();
        tomatoRow = new TomatoCropRow();
        kaleRow = new KaleCropRow();

        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornRow.add(cornStalk);

        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoRow.add(tomatoPlant);

        KaleRoot kaleRoot = new KaleRoot();
        kaleRoot.setHasBeenFertilized(true);
        kaleRow.add(kaleRoot);

        field.addCropRow(cornRow);
        field.addCropRow(tomatoRow);
        field.addCropRow(kaleRow);

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

    @Test
    public void testFroilanName() {
        Assert.assertEquals("Froilan", froilan.getName());
    }

    @Test
    public void testFroilanMakeNoise() {
        Assert.assertEquals("Froilan says: YeeHaw!", froilan.makeNoise());
    }

    // --- Breakfast ---

    @Test
    public void testFroilanEatsBreakfast() {
        froilan.eatBreakfast();
        Assert.assertTrue(froilan.hasBeenFed());
    }

    @Test
    public void testFroilanBreakfastHasEightItems() {
        froilan.eatBreakfast();
        Assert.assertEquals(8, froilan.getFoodEaten().size());
    }

    @Test
    public void testFroilanBreakfastIncludesEarCorn() {
        froilan.eatBreakfast();
        long earCornCount = froilan.getFoodEaten().stream()
                .filter(f -> f instanceof EarCorn).count();
        Assert.assertEquals(1, earCornCount);
    }

    @Test
    public void testFroilanBreakfastIncludesTwoTomatoes() {
        froilan.eatBreakfast();
        long tomatoCount = froilan.getFoodEaten().stream()
                .filter(f -> f instanceof Tomato).count();
        Assert.assertEquals(2, tomatoCount);
    }

    @Test
    public void testFroilanBreakfastIncludesFiveEggs() {
        froilan.eatBreakfast();
        long eggCount = froilan.getFoodEaten().stream()
                .filter(f -> f instanceof Egg).count();
        Assert.assertEquals(5, eggCount);
    }

    // --- Morning horse routine ---

    @Test
    public void testFroilanRidesAllHorses() {
        List<Stable> stables = farm.getStables();
        froilan.rideHorses(stables);
        for (Stable stable : stables) {
            for (Horse horse : stable.getHorses()) {
                Assert.assertFalse(horse.isMounted());
            }
        }
    }

    @Test
    public void testFroilanFeedsAllHorses() {
        List<Stable> stables = farm.getStables();
        froilan.feedHorses(stables);
        for (Stable stable : stables) {
            for (Horse horse : stable.getHorses()) {
                Assert.assertTrue(horse.hasBeenFed());
            }
        }
    }

    @Test
    public void testFroilanRidesTenHorses() {
        List<Stable> stables = farm.getStables();
        int total = stables.stream().mapToInt(Stable::size).sum();
        Assert.assertEquals(10, total);
    }

    // --- Sunday: Froilan plants crops ---

    @Test
    public void testSundayPlantingAddsCornsToRow1() {
        froilan.sundayPlanting(cornRow, tomatoRow, kaleRow);
        Assert.assertEquals(2, cornRow.size());
    }

    @Test
    public void testSundayPlantingAddsTomatoToRow2() {
        froilan.sundayPlanting(cornRow, tomatoRow, kaleRow);
        Assert.assertEquals(2, tomatoRow.size());
    }

    @Test
    public void testSundayPlantingAddsKaleToRow3() {
        froilan.sundayPlanting(cornRow, tomatoRow, kaleRow);
        Assert.assertEquals(2, kaleRow.size());
    }

    // --- Tuesday: Froilan harvests all crops ---

    @Test
    public void testTuesdayHarvestSetsHarvestedOnAllCrops() {
        froilan.tuesdayHarvest(field);
        for (CropRow<?> row : field.getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                Assert.assertTrue(crop.isHasBeenHarvested());
            }
        }
    }

    @Test
    public void testTuesdayCornYieldsEarCorn() {
        froilan.tuesdayHarvest(field);
        for (CornStalk stalk : cornRow.getCrops()) {
            Assert.assertNotNull(stalk.yield());
            Assert.assertTrue(stalk.yield() instanceof EarCorn);
        }
    }

    @Test
    public void testTuesdayTomatoYieldsTomato() {
        froilan.tuesdayHarvest(field);
        for (TomatoPlant plant : tomatoRow.getCrops()) {
            Assert.assertNotNull(plant.yield());
            Assert.assertTrue(plant.yield() instanceof Tomato);
        }
    }

    @Test
    public void testTuesdayKaleYieldsKale() {
        froilan.tuesdayHarvest(field);
        for (KaleRoot root : kaleRow.getCrops()) {
            Assert.assertNotNull(root.yield());
            Assert.assertTrue(root.yield() instanceof Kale);
        }
    }

    @Test
    public void testFroilanHasTractor() {
        Assert.assertNotNull(froilan.getTractor());
    }
}
