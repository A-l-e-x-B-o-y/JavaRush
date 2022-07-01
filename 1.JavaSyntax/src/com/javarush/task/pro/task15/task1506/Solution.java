package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        List<String> list = null;
        Scanner scanner = new Scanner(System.in);

        try {
            list = Files.readAllLines(Paths.get(scanner.nextLine()));
        } catch (IOException e) {
        }

        for (String word : list) {
            char[] chars = word.toCharArray();
            for (char symbol : chars) {
                if (symbol != '.' && symbol != ',' && symbol != ' ') {
                    System.out.print(symbol);
                }
            }
        }
        scanner.close();
    }
}

