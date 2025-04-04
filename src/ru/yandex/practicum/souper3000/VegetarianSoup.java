package ru.yandex.practicum.souper3000;

public class VegetarianSoup extends SoupBase {
    double vegetables;

    VegetarianSoup(SoupBase soup, double vegetables) {
        super(soup.water, soup.salt);
        this.vegetables = vegetables;
    }

    VegetarianSoup(double water, double salt,double vegetables) {
        super(water,salt);
        this.vegetables = vegetables;
    }

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты вегетарианского супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Овощи: " + vegetables + " г.");
    }
}
