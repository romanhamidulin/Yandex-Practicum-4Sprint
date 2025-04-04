package ru.yandex.practicum.enums;

public class Task {

    TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;

    // добавьте конструктор класса
    public Task(TaskPriority taskPriority, String description) {
        priority = taskPriority;
        this.description = description;

    }
    // добавьте метод get для приоритета
    public String getDescription() {
        return description;
    }
}
