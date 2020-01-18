package com.mariiapasichna;

public class Task6 {

    /*6*) Подсчитать количество треугольников, у которых стороны заданы целыми числами, и площадь
    которых не больше 100.
    6.1*) Сделать задание так чтобы не было повторяющихся треугольников, например (3,4,5) и (5,3,4) -
    повторяющиеся.*/

    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a <= 200; a++) {
            for (int b = a; b <= 200; b++) {
                for (int c = b; c <= 200; c++) {
                    if (a + b > c) {
                        double p = (a + b + c) / 2.0;
                        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        if (S <= 100) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
