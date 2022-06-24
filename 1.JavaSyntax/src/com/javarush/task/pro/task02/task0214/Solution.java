package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
Считай с клавиатуры три строки.
А затем:

Выведи на экран третью строку в неизменном виде.
Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
Пример ввода:

Строка Номер РАЗ
Вторая строка
Строка 3
Пример вывода:

Строка 3
ВТОРАЯ СТРОКА
строка номер раз

Requirements:
1. Программа должна считывать с клавиатуры три строки.
2. Третью считанную строку нужно вывести без изменений.
3. Вторую считанную строку нужно вывести в верхнем регистре.
4. Первую считанную строку нужно вывести в нижнем регистре.
5. Все три строки нужно вывести в правильном порядке: третья, вторая, первая.
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();

        System.out.println(string3);
        System.out.println(string2.toUpperCase());
        System.out.println(string1.toLowerCase());
        scanner.close();
    }
}
