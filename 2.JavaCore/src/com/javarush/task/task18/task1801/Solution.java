package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String pathName = reader.readLine();
        FileInputStream fileInput = new FileInputStream(pathName);
        int maxByte = 0;

        while (fileInput.available() > 0) {
            int data = fileInput.read();
            if (data > maxByte) maxByte = data;
        }

        System.out.println(maxByte);
        reader.close();
        fileInput.close();
    }
}
