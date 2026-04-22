package ru.job4j.polimorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Движение только по выделенным полосам в городе");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров: " + count);
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 80;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.passengers(56);
        System.out.println("Стоиомтсть полной заправки составит " + bus.refuel(120) + " рублей");
    }
}
