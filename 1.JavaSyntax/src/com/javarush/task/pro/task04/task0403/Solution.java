package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String sign;

        while (true) {
            sign = scanner.nextLine();
            if (sign.equals("ENTER")) break;
            else count += Integer.parseInt(sign);
        }
        System.out.println(count);
        scanner.close();
    }
}