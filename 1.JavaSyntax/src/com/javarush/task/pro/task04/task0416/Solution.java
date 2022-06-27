package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBottle = scanner.nextInt();
        int people = scanner.nextInt();

        double sum = (countBottle * 1.0) / people;
        System.out.println(sum);
        scanner.close();
    }
}