package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String militaryCommissar = ", явитесь в военкомат";

        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if (age >= 18 & age <= 28) {
            System.out.println(name + militaryCommissar);
        }
        scanner.close();
    }
}
