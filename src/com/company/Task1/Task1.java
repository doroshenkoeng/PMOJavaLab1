package com.company.Task1;

public class Task1 {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double res = 2.37 * Math.sin(t + 1) / Math.sqrt(4 * y * y - 0.1 * y + 5);
        System.out.println("Лабораторная работа № 1. Задание № 1.");
        System.out.println("Исходные данные:");
        System.out.printf("a=%.2f b=%.2f \n", t, y);
        System.out.printf("Результат вычисления выражения: %.2f", res);
    }
}
