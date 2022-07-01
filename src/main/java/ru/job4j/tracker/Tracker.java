package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] temp = new Item[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                temp[j++] = items[i];
            }
        }
        return Arrays.copyOf(temp, j);
    }

    public Item findById(int id) {
        int i = indexOf(id);
        return i != -1 ? items[i] : null;
    }

    private int indexOf(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean replace(int id, Item idem) {
        int i = indexOf(id);
        boolean result = i != -1;
        if (result) {
            idem.setId(id);
            items[i] = idem;
        }
        return result;
    }

    public boolean delete(int id) {
        int i = indexOf(id);
        boolean result = i != -1;
        if (result) {
            items[i] = null;
            size--;
            if (i != items.length - 1) {
                System.arraycopy(items, i + 1, items, i, size - i);
                items[size + 1] = null;
            }
        }
        return result;
    }
}
