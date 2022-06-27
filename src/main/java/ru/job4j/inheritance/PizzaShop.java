package ru.job4j.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaExtraCheese pizza0 = new PizzaExtraCheese();
        PizzaExtraCheeseExtraTomato pizza1 = new PizzaExtraCheeseExtraTomato();
        System.out.println(pizza.name());
        System.out.println(pizza0.name());
        System.out.println(pizza1.name());
    }
}
