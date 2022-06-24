package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public String sound() {
        return "may-may";
    }

    public void show() {
        System.out.println(this.name + "; " + this.food);
    }

    public void feed(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("This here is Gav's food.");
        Cat gav = new Cat();
        gav.feed("kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("And this here on the other hand belongs to Black.");
        Cat black = new Cat();
        black.feed("fish");
        black.giveNick("Black");
        black.show();
    }
}
