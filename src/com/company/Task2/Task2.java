package com.company.Task2;

import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double d = 4.0;
        System.out.println("Лабораторная работа № 1. Задание № 2.");
        System.out.println("Исходные данные:");
        System.out.println("a=" + Double.toString(a));
        System.out.println("b=" + Double.toString(b));
        System.out.println("c=" + Double.toString(c));
        System.out.println("d=" + Double.toString(d));
        System.out.println("Результат:");
        double max = Collections.max(Arrays.asList(a, b, c, d));
        System.out.println("Наибольшее из них = " + Double.toString(max));
        double min = Collections.min(Arrays.asList(a, b, c, d));
        System.out.println("Наименьшее из них = " + Double.toString(min));
    }
}
