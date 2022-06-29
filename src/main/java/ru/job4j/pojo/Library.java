package ru.job4j.pojo;

public class Library {

    public static void printInfo(Book[] bookshelf) {
        for (int i = 0; i < bookshelf.length; i++) {
            System.out.println(i + 1 + ") " + bookshelf[i].getName() + ": "
                                + bookshelf[i].getPages() + " pages");
        }
        System.out.println();
    }

    public static void swapBooks(Book[] bookshelf, int first, int second) {
        Book temp = bookshelf[first];
        bookshelf[first] = bookshelf[second];
        bookshelf[second] = temp;
    }

    public static void findBook(Book[] bookshelf, String name) {
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i].getName().equals(name)) {
                System.out.println(i + 1 + ") " + bookshelf[i].getName() + ": "
                        + bookshelf[i].getPages() + " pages");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 250);
        Book book2 = new Book("History of the empire, vol. 2", 700);
        Book book3 = new Book("History of the empire, vol. 3", 600);
        Book book4 = new Book("History of the empire, vol. 1", 800);
        Book[] bookshelf = {book1, book2, book3, book4};
        printInfo(bookshelf);
        swapBooks(bookshelf, 0, 3);
        printInfo(bookshelf);
        findBook(bookshelf, "Clean code");
    }
}
