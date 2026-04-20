package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Печкин Владимир Васильевич");
        student.setNumberOfGroup(18);
        student.setAdmission(2018, 9, 1);
        System.out.println("Полное имя: " + student.getFullName()
        + System.lineSeparator() + "Номер группы: " + student.getNumberOfGroup()
        + System.lineSeparator() + "Дата поступления: " + student.getAdmission());
    }
}
