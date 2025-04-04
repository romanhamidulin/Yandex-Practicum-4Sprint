package ru.yandex.practicum.modificators.task1;

public class WorkCalculator {

    public int workingHours = 8;
    public String workerName;
    public double coefficient;

    WorkCalculator(String newName) {
        workerName = newName;
    }

    public String getWorkerName() {
        return workerName;
    }

    int calculate(int workDays) {
        return workDays * workingHours;
    }

    double calculateWithCoefficient(int workDays) {
        return workDays * workingHours * coefficient;
    }
}
