package com.javarush.task.pro.task04.task0412;

import java.util.Scanner;

/* 
Сумма кратных чисел
В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно), кратных multiple.
Для этого используй цикл for.
Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.


Requirements:
1. Программа должна вывести в консоль сумму чисел от start (включительно) до end (не включительно), кратных multiple.
2. В программе необходимо использовать цикл for.
3. В цикле for необходимо использовать оператор continue.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple == 0) {
                sum += i;
            } else {
                continue;
            }
        }
        System.out.println(sum);
    }
}