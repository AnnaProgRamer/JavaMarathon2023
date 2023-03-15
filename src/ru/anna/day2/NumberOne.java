package ru.anna.day2;
import java.util.Scanner;
public class NumberOne {
    private int floor;

    public NumberOne() {
        System.out.println("Введите этаж");
        Scanner fl = new Scanner(System.in);
        floor = fl.nextInt();
    }

    public String checkFloor() {
        if (floor >= 1 && floor <= 4) {
            return "Малоэтажный дом";
        }
        else if (floor >= 5 && floor <= 8) {
            return "Среднеэтажный дом";
        }
        else if (floor >= 9) {
            return "Многоэтажный дом";
        }
        else {
            return "Ошибка ввода";
        }
    }
}