package ru.yandex.practicum.hashcode;

import java.util.Objects;

public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны

    Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || this.getClass()!=obj.getClass()) {
            return false;
        } else {
            Movie otherMovie = (Movie) obj;
            return Objects.equals(title, otherMovie.title) &&
                    Objects.equals(releaseYear, otherMovie.releaseYear);
        }
        //return false;
    }
    public int hashCode() {
        return Objects.hash(title, releaseYear);
    }
}
