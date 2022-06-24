package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
Амиго создал секретное слово для доступа к закрытой информации, но у него сломалась клавиатура, и теперь невозможно набирать буквы в верхнем регистре.
Напиши программу, которая будет сравнивать введенную строку со строкой из переменной secret, не учитывая регистр.
Если введенная строка равна строке из переменной secret, программа выводит на экран сообщение "доступ разрешен". В ином случае - "доступ запрещен".


Requirements:
1. Программа должна считывать строку c клавиатуры.
2. В классе Solution должна быть публичная статическая переменная secret типа String.
3. Если введенная строка и строка из переменной secret одинаковые, не учитывая регистр, то программа должна вывести сообщение "доступ разрешен".
4. Если введенная строка и строка из переменной secret разные, не учитывая регистр, то программа должна вывести сообщение "доступ запрещен".
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if (secret.equalsIgnoreCase(text)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
        scanner.close();
    }
}
