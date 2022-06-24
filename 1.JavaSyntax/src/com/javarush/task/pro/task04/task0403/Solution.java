package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.


Requirements:
1. Программа должна считывать данные c клавиатуры.
2. Программа должна выводить данные на экран, если пользователь ввел слово "ENTER".
3. Необходимо посчитать сумму введенных целых чисел и вывести её на экран.
4. В программе необходимо использовать цикл while.
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