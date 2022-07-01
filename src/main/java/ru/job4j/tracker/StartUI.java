package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            System.out.println("The user entered " + select);
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter the name: ");
                Item item = new Item(scanner.nextLine());
                tracker.add(item);
                System.out.println("An item was successfully added. " + item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("There are no items in the storage yet.");
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.print("Enter item id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter a new name: ");
                Item item = new Item(scanner.nextLine());
                if (tracker.replace(id, item)) {
                    System.out.println("The item has been successfully modified.");
                } else {
                    System.out.println("The item in question doesn't exist.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print("Enter item id: ");
                if (tracker.delete(Integer.parseInt(scanner.nextLine()))) {
                    System.out.println("Item deleted successfully");
                } else {
                    System.out.println("The item in question doesn't exist.");
                }
            } else if (select == 6) {
                System.out.println("Exiting...");
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}