package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        int count = 0;

        while (file.ready()) {
            String string = file.readLine();
            string = string.replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
            String[] line = string.split(" ");

            for (int i = 0; i < line.length; i++) {
                if (line[i].equals("world")) count++;
            }
        }

        System.out.println(count);
        reader.close();
        file.close();
    }
}
