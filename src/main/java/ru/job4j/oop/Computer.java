package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer() {
        this.multiMonitor = true;
        this.ssd = 1000;
        this.cpu = "demoman";
    }

    public Computer(boolean b) {
        this.multiMonitor = b;
        this.ssd = 500;
        this.cpu = "goodman";
    }

    public void printInfo() {
        System.out.println("Неколько мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    public static void main(String[] args) {
        Computer computer = new Computer(true, 500, "Intel POCIK-2005kosar");
        computer.printInfo();
        Computer comp = new Computer(true, 256, "AMD BABKA 5 300");
        comp.printInfo();
        Computer def = new Computer();
        def.printInfo();
        Computer def1 = new Computer(true);
        def1.printInfo();
        Computer def2 = new Computer(false);
        def2.printInfo();
    }
}
