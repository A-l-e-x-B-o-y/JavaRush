package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder stringBuilder = new StringBuilder();

        while (file1.ready()) {
            String[] array = file1.readLine().split(" ");

            for (String word : array) {
                if (word.length() > 6) {
                    stringBuilder.append(word + ",");
                }
            }
        }

        stringBuilder.replace(stringBuilder.length()-1, stringBuilder.length(), "");
        file2.write(stringBuilder.toString());

        file1.close();
        file2.close();
    }
}
