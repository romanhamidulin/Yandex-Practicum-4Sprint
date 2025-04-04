package ru.yandex.practicum.toString;

import java.util.Arrays;

public class PostComment {
    private String text; // содержание комментария
    private String[] whoLiked; // кто поддержал

    @Override
    public String toString() {
        return "PostComment{" // имя класса
                + "text='" + text + "', " // поле1='значение1'
                + "whoLiked=" + Arrays.toString(whoLiked)
                + "}";
    }


    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] strings) {
        this.whoLiked = strings;
    }
}
