package com.mariiapasichna;

public class Util {

    public static void sort(int[] arr, SortType sortType) {
        switch (sortType) {
            case BUBBLE:
                sortBubble(arr);
                break;
            case INSERT:
                sortInsert(arr);
                break;
            case SELECT:
                sortSelect(arr);
                break;
            default:
                System.out.println("Unknown");
        }
        if (sortType == SortType.BUBBLE) {
            System.out.println("Sort type: Bubble");
        }
        if (sortType == SortType.INSERT) {
            System.out.println("Sort type: Insert");
        }
        if (sortType == SortType.SELECT) {
            System.out.println("Sort type: Select");
        }
    }

    private static void sortSelect(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void sortInsert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
