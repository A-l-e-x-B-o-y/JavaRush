package com.javarush.task.task18.task1819;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String filePath1 = scanner.nextLine();
        String filePath2 = scanner.nextLine();

        BufferedReader file1 = new BufferedReader(new FileReader(filePath1));
        
        while (file1.ready()) {
            list.add(file1.readLine());
        }


        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath1));
        BufferedReader file2 = new BufferedReader(new FileReader(filePath2));
        
        while (file2.ready()) {
            fileWriter.write(file2.readLine());
        }

       for (String string : list) {
           fileWriter.write(string);
       }

        file1.close();
        file2.close();
        fileWriter.close();
    }
}
