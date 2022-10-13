package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileInput = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileOutput = new BufferedWriter(new FileWriter(reader.readLine()));
        ArrayList<Integer> list = new ArrayList<>();

        while (fileInput.ready()) {
            String[] temp = fileInput.readLine().split(" ");

            for (int i = 0; i < temp.length; i++) {
                try {
                    list.add(Integer.parseInt(temp[i]));
                } catch (Exception e) {
                }
            }
        }

        for (Integer number : list) {
            fileOutput.write(String.valueOf(number) + " ");
        }

        reader.close();
        fileInput.close();
        fileOutput.close();
    }
}
