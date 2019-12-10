package com.mariiapasichna;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    /*2) Заполнить массив случайными числами. Подсчитать:
- количество элементов которые больше своего соседа слева
- количество четных элементов
- количество элементов которые меньше среднего арифметического*/

    private static final int SIZE = 10;

    public static void main(String[] args) {
        int arr[] = new int[SIZE];
        createArrayAndInit(arr);
        System.out.println(Arrays.toString(arr));

        int largestNumber = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                largestNumber++;
            }
        }
        System.out.println("Количество элементов которые больше своего соседа слева: " + largestNumber);

        int evenNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumber++;
            }
        }
        System.out.println("Количество четных элементов: " + evenNumber);

        int lessAverage = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        //System.out.println(average);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                lessAverage++;
            }
        }
        System.out.println("Количество элементов которые меньше среднего арифметического: " + lessAverage);
    }

    private static void createArrayAndInit(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }
}
