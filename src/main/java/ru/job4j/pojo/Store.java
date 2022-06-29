package ru.job4j.pojo;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product eggs = new Product("Eggs", 19);
        Product[] storage = new Product[3];
        storage[0] = milk;
        storage[1] = bread;
        storage[2] = eggs;
        for (Product i : storage) {
            System.out.println(i.getName() + ": " + i.getCount());
        }
        System.out.println("Now we're gonna replace our milk with butter.");
        storage[0] = new Product("Oil", 11);
        System.out.println("The storage contents after the changes:");
        for (Product i : storage) {
            System.out.println(i.getName() + ": " + i.getCount());
        }
        System.out.println("Only the items who amount for more than 10:");
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].getCount() > 10) {
                System.out.println(i + 1 + ": " + storage[i].getName() + " - " + storage[i].getCount());
            }
        }
    }
}
