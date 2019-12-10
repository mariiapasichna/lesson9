package com.mariiapasichna;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    /*4*) Заполнить массив случайными числами. Создать массив который в N раза больше исходного и N раз
    продублировать в нем исходный массив.
Например: был массив [1,2,3] и N=2 => [1,2,3,1,2,3]*/

    private static final int SIZE = 5;
    private static final int N = 3;

    public static void main(String[] args) {
        int arr[] = new int[SIZE];
        createArrayAndInit(arr);
        multiplyArray(arr);
    }

    private static void multiplyArray(int[] arr) {
        int arr2[] = new int[SIZE * N];
        for (int n = 0; n < N; n++) {
            for (int i = 0; i < arr.length; i++) {
                arr2[arr.length * n + i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    private static void createArrayAndInit(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
    }
}
