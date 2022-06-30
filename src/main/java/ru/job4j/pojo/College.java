package ru.job4j.pojo;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setLastName("Good");
        student.setFirstName("Man");
        student.setMiddleName("Junior");
        student.setGroup("Wonderful people");
        student.setEnrollmentDate(LocalDateTime.now());
        String ln = System.lineSeparator();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Full name: " + student.getLastName() + " " + student.getFirstName() + " "
                            + student.getMiddleName() + ln
                            + "Group: " + student.getGroup() + ln
                            + "Enrollment date: " + student.getEnrollmentDate().format(formatter));
    }
}
