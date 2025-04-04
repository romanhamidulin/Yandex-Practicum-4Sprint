package ru.yandex.practicum.objectEquals;

import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)
    @Override
    public boolean equals(Object obj) {
       if (obj==null || this.getClass()!=obj.getClass()) {
           return false;
       } else {
           Song otherSong = (Song) obj;
           return Objects.equals(title, otherSong.title) &&
                   Objects.equals(artist, otherSong.artist) &&
                   (songwriter == otherSong.songwriter);
       }
       //return false;
    }

}