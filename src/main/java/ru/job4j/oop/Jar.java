package ru.job4j.oop;

public class Jar {

    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another) {
        this.value += another.value;
        another.value = 0;
    }

    public static void printInfo(Jar first, Jar second) {
        System.out.println("Value 1: " + first.value);
        System.out.println("Value 2: " + second.value);
        System.out.println();
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        printInfo(first, second);
        first.pour(second);
        printInfo(first, second);
    }
}
