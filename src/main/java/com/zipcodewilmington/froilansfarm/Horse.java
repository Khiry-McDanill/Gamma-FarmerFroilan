package com.zipcodewilmington.froilansfarm;

public class Horse implements NoiseMaker, Rideable {
    private String name;
    private boolean mounted;

    public Horse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean mounted) {
        this.mounted = mounted;
    }

    private boolean hasBeenFed;

    public boolean hasBeenFed() {
        return hasBeenFed;
    }

    public void eat(Edible food) {
        hasBeenFed = true;
    }

    @Override
    public void mount() {
        setMounted(true);
    }

    @Override
    public void dismount() {
        setMounted(false);
    }

    @Override
    public String makeNoise() {
        return "Neeeeighhhhh";
    }

    @Override
    public String toString() {
        return "Horse named " + name;
    }
}
