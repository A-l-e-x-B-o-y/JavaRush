package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));

        while (file1.ready()) {
            String[] array = file1.readLine().split(" ");

            for (String word : array) {
                if (word.matches(".*\\d.*")) {
                    file2.write(word + " ");
                }
            }
        }

        file1.close();
        file2.close();
    }
}
