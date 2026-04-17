package com.zipcodewilmington.froilansfarm;

public class Horse {
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

    public String makeNoise() {
        return "Neeeeighhhhh";
    }

    @Override
    public String toString() {
        return "Horse named " + name;
    }
}
