package com.mariiapasichna;

import java.util.Arrays;

public class Task5 {

    /*5*) Написать метод который ищет при помощи бинарного поиска есть ли число в массиве.
Параметры - отсортированный массив и число которое надо проверить. Результат типа boolean.*/

    private static final int SIZE = 100;

    public static void main(String[] args) {
        int arr[] = new int[SIZE];
        int number = 78;
        int first = 0;
        int last = arr.length - 1;
        Task1.createArrayAndInit(arr);
        Arrays.sort(arr);
        binarySearch(arr, number, first, last);
    }

    private static boolean binarySearch(int[] arr, int number, int first, int last) {
        if (first <= last) {
            int middle = (first + last) / 2;
            if (arr[middle] == number) {
                System.out.println("The number " + number + " is found by index " + middle);
                return true;
            }
            if (arr[middle] > number) {
                return binarySearch(arr, number, first, middle - 1);
            } else {
                return binarySearch(arr, number, middle + 1, last);
            }
        }
        System.out.println("The number " + number + " isn't found");
        return false;
    }
}