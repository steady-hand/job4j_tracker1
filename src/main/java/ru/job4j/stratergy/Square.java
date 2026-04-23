package ru.job4j.stratergy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return   " ______" + ln
                + "|      |" + ln
                + "|      |" + ln
                + "|______|" + ln;
    }
}
