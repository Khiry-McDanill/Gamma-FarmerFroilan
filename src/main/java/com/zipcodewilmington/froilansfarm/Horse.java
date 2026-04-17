package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable {
    private boolean mounted;

    public Horse(String name) {
        super(name);
    }

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean mounted) {
        this.mounted = mounted;
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
