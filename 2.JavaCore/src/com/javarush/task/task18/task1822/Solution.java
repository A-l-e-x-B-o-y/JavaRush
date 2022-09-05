package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));

        while (file.ready()) {
            String data = file.readLine();
            String id = data.substring(0, data.indexOf(" "));
            if (id.equals(args[0])) {
                System.out.println(data);
            }
        }

        file.close();
    }
}
