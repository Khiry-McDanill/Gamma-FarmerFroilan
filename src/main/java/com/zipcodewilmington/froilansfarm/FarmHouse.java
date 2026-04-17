package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class FarmHouse {
    private final String name = "Farm House";
    private ArrayList<Person> residents;
    private int capacity;

    public FarmHouse() {
        this.residents = new ArrayList<>();
        this.capacity = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public boolean add(Person person) {
        if (isFull()) {
            return false;
        }
        residents.add(person);
        return true;
    }

    public Person get(int index) {
        return residents.get(index);
    }

    public boolean remove(Person person) {
        return residents.remove(person);
    }

    public int size() {
        return residents.size();
    }

    public boolean isEmpty() {
        return residents.isEmpty();
    }

    public void clear() {
        residents.clear();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return residents.size() >= capacity;
    }

    public ArrayList<Person> getResidents() {
        return residents;
    }
}
