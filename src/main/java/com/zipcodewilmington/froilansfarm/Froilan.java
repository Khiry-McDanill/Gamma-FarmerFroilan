package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Froilan extends Farmer {

    private Tractor tractor;
    private List<Edible> foodEaten;

    public Froilan() {
        super("Froilan");
        this.tractor = new Tractor();
        this.foodEaten = new ArrayList<>();
    }

    // Froilan eats 1 EarCorn, 2 Tomato, 5 Egg every morning
    public void eatBreakfast() {
        eat(new EarCorn());

        eat(new Tomato());
        eat(new Tomato());

        eat(new Egg(false));
        eat(new Egg(false));
        eat(new Egg(false));
        eat(new Egg(false));
        eat(new Egg(false));
    }

    @Override
    public void eat(Edible food) {
        super.eat(food);
        foodEaten.add(food);
    }

    public void rideHorses(List<Stable> stables) {
        for (Stable stable : stables) {
            for (Horse horse : stable.getHorses()) {
                mount(horse);
                dismount(horse);
            }
        }
    }

    public void feedHorses(List<Stable> stables) {
        for (Stable stable : stables) {
            for (Horse horse : stable.getHorses()) {
                horse.eat(new EarCorn());
                horse.eat(new EarCorn());
                horse.eat(new EarCorn());
            }
        }
    }

    // Sunday: plant 3 crop types in first 3 rows
    public void sundayPlanting(CornCropRow cornRow, TomatoCropRow tomatoRow, KaleCropRow kaleRow) {
        plant(new CornStalk(), cornRow);
        plant(new TomatoPlant(), tomatoRow);
        plant(new KaleRoot(), kaleRow);
    }

    // Tuesday: use Tractor to harvest all crops in the field
    public void tuesdayHarvest(Field field) {
        tractor.mount();
        tractor.harvestsCrop();
        for (CropRow<?> row : field.getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                crop.setHasBeenHarvested(true);
            }
        }
        tractor.dismount();
    }

    public Tractor getTractor() {
        return tractor;
    }

    public List<Edible> getFoodEaten() {
        return foodEaten;
    }

    @Override
    public String makeNoise() {
        return "Froilan says: YeeHaw!";
    }
}
