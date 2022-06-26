package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error def = new Error();
        Error error0 = new Error(true, 10, "Everything's in due order.");
        Error error1 = new Error(false, -2, "An anomaly detected. Immediate response required.");
        def.printInfo();
        error0.printInfo();
        error1.printInfo();
    }
}
