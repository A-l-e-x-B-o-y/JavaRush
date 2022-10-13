package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        List<String> arrayStrings = new ArrayList<>();

        while (file.ready()) {
            arrayStrings.add(file.readLine());
        }

        for (int i = 0; i < arrayStrings.size(); i++) {
            System.out.println(new StringBuilder(arrayStrings.get(i)).reverse());
        }

        reader.close();
        file.close();
    }
}
