package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader(args[0]);
        int countSpace = 0;
        int countAll = 0;

        while (file.ready()) {
            int data = file.read();
            if (data == 32) {
                countSpace++;
            }
            countAll++;
        }

        System.out.printf("%.2f %n",(double) countSpace / countAll * 100);
        file.close();
    }
}
