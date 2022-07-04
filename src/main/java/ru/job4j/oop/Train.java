package ru.job4j.oop;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Trains can only move on rails");
    }

    @Override
    public String size() {
        return "Trains are really long";
    }
}
