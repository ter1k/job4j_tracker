package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
            System.out.println("Пешеходы по лужам,");
            System.out.println("А вода по асфальту рекой.");
        } else if (position == 2) {
            System.out.println("За день мы устали очень,");
            System.out.println("Скажем всем: Спокойной ночи!");
            System.out.println("Глазки закрывай,");
            System.out.println("И больше их не открывай.");
        } else {
            System.out.println("Песня не найдена.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Jukebox juke = new Jukebox();
        juke.music(1);
        juke.music(2);
        juke.music(3);
    }
}
