package ru.job4j.polimorphism;

public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        Vehicle vehicle = sportCar;
        Fuel fuel = sportCar;
        vehicle.changeGear();
        vehicle.accelerate();
        vehicle.steer();
        vehicle.brake();
        fuel.refill();

        Vehicle sportCar2 = new SportCar();
        sportCar2.changeGear();
        sportCar2.accelerate();
        sportCar2.steer();
        sportCar2.brake();
        sportCar2.refill();
    }
}
