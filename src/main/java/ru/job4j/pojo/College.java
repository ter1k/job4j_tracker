package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setLastName("Good");
        student.setFirstName("Man");
        student.setMiddleName("Junior");
        student.setGroup("Wonderful people");
        student.setEnrollmentDate(new Date());
        String ln = System.lineSeparator();
        System.out.println("Full name: " + student.getLastName() + " " + student.getFirstName() + " "
                            + student.getMiddleName() + ln
                            + "Group: " + student.getGroup());
    }
}
