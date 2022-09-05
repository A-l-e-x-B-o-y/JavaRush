package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathName = reader.readLine();
        FileInputStream file = new FileInputStream(pathName);
        int minByte = 1000;

        while (file.available() > 0) {
            int data = file.read();
            if (data < minByte) minByte = data;
        }

        System.out.println(minByte);
        reader.close();
        file.close();
    }
}
