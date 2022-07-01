package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        String ln = System.lineSeparator();
        while (run) {
            System.out.println("Игры" + ln
                                + "1. Танчики" + ln
                                + "2. Супер марио" + ln
                                + "3. Выйти");
            System.out.print("Введите пункт меню, чтобы начать игру: ");
            int select = Integer.parseInt(input.nextLine());
            switch (select) {
                case 3 -> {
                    System.out.println("Игра завершена.");
                    run = false;
                }
                case 1 -> System.out.println("Танчики загружаются...");
                case 2 -> System.out.println("Супер марио загружается...");
                default -> System.out.println("Такой игры нет.");
            }
            System.out.println();
        }
    }
}
