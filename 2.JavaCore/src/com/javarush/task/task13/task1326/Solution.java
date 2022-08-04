package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String pathName = scanner.nextLine();
        BufferedReader note = new BufferedReader(new InputStreamReader(new FileInputStream(pathName)));
        List<Integer> list = new ArrayList<>();

        while (note.ready()) {
            String line = note.readLine();
            list.add(Integer.parseInt(line));
        }

        Collections.sort(list);
        for (Integer number : list) {
            if (number%2 == 0) {
                System.out.println(number);
            }
        }

        scanner.close();
        note.close();
    }
}
