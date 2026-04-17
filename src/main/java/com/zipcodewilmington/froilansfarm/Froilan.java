package com.zipcodewilmington.froilansfarm;

public class Froilan extends Farmer {

    private Tractor tractor;

    public Froilan(String name) {
        super(name);
        this.tractor = new Tractor();
    }

    public void eatBreakfast() {
        eat(new EarCorn());
        eat(new Tomato());
        eat(new Tomato());
        eat(new Egg());
        eat(new Egg());
        eat(new Egg());
        eat(new Egg());
        eat(new Egg());
        System.out.println(name + " eats breakfast: 1 EarCorn, 2 Tomatoes, 5 Eggs.");
    }

    public void harvestField(Field field) {
        tractor.mount();
        tractor.harvestsCrop();
        for (CropRow<?> row : field.getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                crop.setHasBeenHarvested(true);
            }
        }
        tractor.dismount();
    }

    public void morningRoutine(Stable stable) {
        for (Horse horse : stable.getHorses()) {
            mount(horse);
            System.out.println(name + " rides " + horse.getName() + ".");
            dismount(horse);
            feed(horse);
        }
    }

    public Tractor getTractor() {
        return tractor;
    }

    @Override
    public String makeNoise() {
        return "Froilan says: Time to get to work!";
    }
}
