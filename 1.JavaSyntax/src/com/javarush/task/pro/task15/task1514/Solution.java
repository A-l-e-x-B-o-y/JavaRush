package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Path path1 = Paths.get(str1);
        Path path2 = Paths.get(str2);

        try {
            System.out.println(path1.relativize(path2));
        } catch (Exception e) {
        }
    }
}

