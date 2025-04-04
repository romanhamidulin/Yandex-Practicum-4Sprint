package ru.yandex.practicum.inheritance.texla;

class Automobile extends Transport{
    public Automobile() {
        wheelsNumber = 4;
    }

    protected String direction;

    public void turnTo(String worldSide) {
        direction = worldSide;
    }
}
