package com.mariiapasichna;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {

    /*3) Попросить пользователя ввести строку и имя файла. Записать строку в файл.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter string:");
        String str = scanner.nextLine();
        System.out.println("Please, enter file name:");
        String fileName = scanner.nextLine();

        writeToFile(str, fileName);
    }

    private static void writeToFile(String str, String fileName) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
