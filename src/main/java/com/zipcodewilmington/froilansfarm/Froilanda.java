package com.zipcodewilmington.froilansfarm;

public class Froilanda extends Person implements Pilot {

    private CropDuster cropDuster;

    public Froilanda(String name) {
        super(name);
        this.cropDuster = new CropDuster();
    }

    @Override
    public void fly() {
        cropDuster.flies();
    }

    @Override
    public void land() {
        System.out.println(name + " lands the CropDuster.");
    }

    public void fertilizeField(Field field) {
        cropDuster.mount();
        fly();
        for (CropRow<?> row : field.getCropRows()) {
            cropDuster.fertilize(row);
        }
        land();
        cropDuster.dismount();
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    @Override
    public String makeNoise() {
        return "Froilanda says: Ready to fly!";
    }
    @Override
    public void eatBreakfast() {
        eat(new EarCorn());
        eat(new EarCorn());
        eat(new Tomato());
        eat(new EdibleEgg());
        eat(new EdibleEgg());
    }
}
//method for froilanda that shows her food