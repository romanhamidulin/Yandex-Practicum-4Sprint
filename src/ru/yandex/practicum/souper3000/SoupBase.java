package ru.yandex.practicum.souper3000;

public class SoupBase {
    double water;
    double salt;

    // реализуйте конструктор
    SoupBase(double water, double salt) {
        this.water = water;
        this.salt = salt;
    }

    public void printIngredients() {
        System.out.println("Ингредиенты суповой основы:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
    }
}