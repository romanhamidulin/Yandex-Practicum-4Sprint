package ru.yandex.practicum.object;

import java.util.ArrayList;

public class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things= new ArrayList<>();
    // реализуйте метод put()
    public void put(Object obj) {
        things.add(obj);
    }
    // реализуйте метод check()
    public boolean check(Object target) {

        for (Object object : things) { // логика проверки вещи в списке
        if(object.equals(target)) {
            return true;
        }

    }
        if (target!=null)    return false;

        return false;
    }
}
