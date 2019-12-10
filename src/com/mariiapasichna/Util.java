package com.mariiapasichna;

public class Util {

    public static void sort(int[] arr, SortType sortType) {
        switch (sortType) {
            case BUBBLE:
                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = 0; j < arr.length - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int tmp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = tmp;
                        }
                    }
                }
                break;
            case INSERT:
                for (int i = 1; i < arr.length; i++) {
                    for (int j = i; j > 0; j--) {
                        if (arr[j - 1] > arr[j]) {
                            int tmp = arr[j];
                            arr[j] = arr[j - 1];
                            arr[j - 1] = tmp;
                        }
                    }
                }
                break;
            case SELECT:
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] < arr[i]) {
                            int tmp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = tmp;
                        }
                    }
                }
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
}
