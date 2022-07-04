package ru.job4j.oop;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Buses move on the ground");
    }

    @Override
    public String size() {
        return "Buses are about 2 times larger than a regular-sized car";
    }
}
