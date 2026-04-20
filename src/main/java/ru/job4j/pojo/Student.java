package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private int numberOfGroup;
    private LocalDate admission;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public LocalDate getAdmission() {
        return admission;
    }

    public void setAdmission(int year, int month, int dayOfMonth) {
        this.admission = LocalDate.of(year, month, dayOfMonth);
    }
}
