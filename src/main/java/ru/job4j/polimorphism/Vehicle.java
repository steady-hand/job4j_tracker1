package ru.job4j.polimorphism;

public interface Vehicle extends Fuel {
    void accelerate();

    void brake();

    void steer();

    void changeGear();

}
