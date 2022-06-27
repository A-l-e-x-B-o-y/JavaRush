package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = scanner.nextInt();
        int i = 0;

        if (count <= 0 || count >= 5 ) count = 1;
        do {
            System.out.println(text);
            i++;
        } while (i < count);
        scanner.close();
    }
}