package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 12;
        int u = a + b;

        if (u >= 0) {
            System.out.println("Сумма положительная.");
        }
        if (u < 0) {
            System.out.println("Сумма отрицательная.");
        }
    }

    public static void printColor() {
        int value = 110;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }
        public static void compareNumbers() {
        int a = 15;
        int b = 13;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }
}

