package ru.yandex.practicum.redefinition.task2;

class Texla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Texla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {

        // исправьте метод для ускорения при автопилоте
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        }
        else {
            speed = autoPilotMaxSpeed;
        }
    }

    // переопределите метод для ускорения
    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }
    // переопределите метод для торможения
    @Override
    public void brake(){
        if (speed > 0) {
            speed -= brakingSpeed;
        if (speed < 0)
            speed = 0;
        }

    }
}
