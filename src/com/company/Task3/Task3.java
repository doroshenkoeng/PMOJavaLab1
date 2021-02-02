package com.company.Task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Integer[] myarray = new Integer[]{1, 4, 23, 0, 1, 10, 100, 200, 10, 1, 200};
        System.out.println("Лабораторная работа № 1. Задание № 3.");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(myarray));
        List<Integer> myList = Arrays.asList(myarray);
        int indexOfFirstMax = myList.indexOf(Collections.max(myList));
        int indexOfLastMax = myList.lastIndexOf(Collections.max(myList));
        System.out.println("Индекс 1-го максимума: " + Integer.toString(indexOfFirstMax + 1));
        System.out.println("Индекс последнего максимума: " + Integer.toString(indexOfLastMax + 1));
    }
}
