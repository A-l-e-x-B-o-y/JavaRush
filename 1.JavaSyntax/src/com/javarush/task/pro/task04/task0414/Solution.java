package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
В этой задаче нужно:

Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
Пример ввода:
абв
2

Пример вывода:
абв
абв


Requirements:
1. Программа должна считывать данные c клавиатуры.
2. Программа должна выводить данные на экран.
3. Программа должна выводить на экран строку number раз.
4. Программа должна выводить на экран строку один раз, если число number меньше/равно 0 или больше/равно 5.
5. В программе необходимо использовать цикл do-while.
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