package ru.job4j.cast;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle airPlane = new Airplane();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{bus, airPlane, train};
        for (Vehicle transport : vehicles) {
            transport.move();
        }
    }
}
