package ru.job4j.io;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Кто? ");
        String name = input.nextLine();
        System.out.println(name + " goodman :)");
    }
}