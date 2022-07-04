package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter the name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("An item was successfully added: " + item);
    }

    public static void showAll(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item temp : items) {
                System.out.println(temp);
            }
        } else {
            System.out.println("There are no items in the storage yet.");
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id = input.askInt("Enter item id: ");
        Item item = new Item(input.askStr("Enter a new name: "));
        if (tracker.replace(id, item)) {
            System.out.println("The item has been successfully modified.");
        } else {
            System.out.println("The item in question doesn't exist.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id = input.askInt("Enter item id: ");
        if (tracker.delete(id)) {
            System.out.println("Item deleted successfully");
        } else {
            System.out.println("The item in question doesn't exist.");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Error: item with an id of " + id + " was not found.");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item temp: items) {
                System.out.println(temp);
            }
        } else {
            System.out.println("Error: item with a name \"" + name + "\" was not found");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                showAll(input, tracker);
            } else if (select == 2) {
                editItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findById(input, tracker);
            } else if (select == 5) {
                findByName(input, tracker);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
