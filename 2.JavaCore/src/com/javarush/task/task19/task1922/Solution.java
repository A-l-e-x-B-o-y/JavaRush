package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));

        while (file.ready()) {
            String string = file.readLine();
            String[] array = string.split(" ");
            int count = 0;

            for (String word : array) {
                for (String wordExample : words) {
                    if (word.equals(wordExample)) count++;
                }
            }

            if (count == 2) System.out.println(string);
        }

        reader.close();
        file.close();
    }
}
