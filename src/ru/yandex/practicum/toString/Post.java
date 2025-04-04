package ru.yandex.practicum.toString;

import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title; // заголовок
    private String content; // содержание
    private String[] tags; // теги
    private ArrayList<PostComment> comments; //комментарии

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

/* Вывод должен получиться таким:
Post{title='xxx', content.length='x', tags=[x,x],
comments=[PostComment{text='x!', whoLiked=[x, x]},
PostComment{text='x', whoLiked=[x,x]},
PostComment{text='x', whoLiked=null}]} */
    @Override
    public String toString() {
        String result =  "Post{" + "title='" + title;
         if (content != null) {
             result += "', content.length='"+content.length();
         } else {
             result = result + "', content=null"; // выводим информацию, что поле равно null
         }
         result += "', tags=" + Arrays.toString(tags);
         result += ",\ncomments=" + comments;
        return result + '}';
    }

}
