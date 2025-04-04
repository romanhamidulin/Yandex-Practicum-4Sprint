package ru.yandex.practicum.souper3000;

public class Bouillon extends SoupBase {
    double meat;


    // реализуйте необходимые конструкторы
    Bouillon(SoupBase soup, double meat) {
        super(soup.water, soup.salt);
        this.meat = meat;
    }

    Bouillon(double water, double salt, double meat) {
        super(water, salt);
        this.meat = meat;
    }

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты бульона:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Мясо: " + meat + " г.");
    }
}