package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
Каждый вывод - с новой строки.
Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.


Requirements:
1. Программа должна считывать имя c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить 10 раз текст, указанный в задании. Каждый вывод - с новой строки.
4. В программе необходимо использовать цикл while.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = " любит меня.";

        String name = scanner.nextLine();
        int count = 0;

        while (count < 10) {
            System.out.println(name + text);
            count++;
        }
        scanner.close();
    }
}
