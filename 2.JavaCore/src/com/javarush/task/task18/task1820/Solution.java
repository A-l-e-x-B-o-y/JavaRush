package com.javarush.task.task18.task1820;

import java.io.*;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()));
        String[] list = file1.readLine().split(" ");

        for (String count : list) {
            double number = Double.parseDouble(count);
            file2.write(String.valueOf(Math.round(number)) + " ");
        }

        reader.close();
        file1.close();
        file2.close();
    }
}
