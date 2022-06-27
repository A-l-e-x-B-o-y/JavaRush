package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        int temp = -1;

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[i].equals(strings[j])) {
                        strings[j] = null;
                        temp = i;
                    }
                }
            } else {
                continue;
            }
            strings[temp] = null;
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
        scanner.close();
    }
}