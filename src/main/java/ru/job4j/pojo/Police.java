package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Petr");
        license.setModel("My car");
        license.setCode("XGAMER");
        license.setCreated(new Date());
        String ln = System.lineSeparator();
        System.out.println("Name: " + license.getOwner() + ln
                + "Car model: " + license.getModel() + ln
                + "Car code: " + license.getCode());
    }
}
