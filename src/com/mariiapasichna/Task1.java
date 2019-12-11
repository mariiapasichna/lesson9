package com.mariiapasichna;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    /*1) Создать enum который отображает вид сортировки, например enum SortType { BUBBLE, INSERT, SELECT }.
    Написать метод который принимает массив и переменную типа enum и сортирует выбранным типом сортировки,
    например: sort(arr, SortType.INSERT);*/

    private static final int SIZE = 10;

    public static void main(String[] args) {
        int arr[] = new int[SIZE];
        createArrayAndInit(arr);
        //System.out.println(Arrays.toString(arr));
        SortType sortType = SortType.SELECT;
        com.mariiapasichna.Util.sort(arr, sortType);
        System.out.println(Arrays.toString(arr));
    }

    public static void createArrayAndInit(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }
}
