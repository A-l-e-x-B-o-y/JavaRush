package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader inputStream = new InputStreamReader(new FileInputStream(reader.readLine()));
        BufferedReader bufferedReader = new BufferedReader(inputStream);

        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            System.out.println(line);
        }

        bufferedReader.close();
        inputStream.close();
    }
}