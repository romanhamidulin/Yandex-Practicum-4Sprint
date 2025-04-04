package ru.yandex.practicum.hashcode;

import java.util.Objects;

public class Actor {
    String firstName;
    String lastName;

    Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    @Override
    public boolean equals(Object obj) {
        if (obj==null || this.getClass()!=obj.getClass()) {
            return false;
        } else {
            Actor otherActor = (Actor) obj;
            return Objects.equals(firstName, otherActor.firstName) &&
                    Objects.equals(lastName, otherActor.lastName);
        }
        //return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}
