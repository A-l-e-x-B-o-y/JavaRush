package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
В этой задаче тебе нужно:

Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
Примеры.

Массив после чтения строк:
{"Hello", "Hello", "World", "Java", "Tasks", "World"}
Массив после удаления повторяющихся строк:
{null, null, null, "Java", "Tasks", null}


Requirements:
1. В методе main(String[]) считай с клавиатуры 6 строк и заполнить ими массив strings.
2. В методе main(String[]) удали(заменить строку на null) элементы из массива strings с одинаковыми строками.
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        int temp = -1;

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                for (int j = i + 1; j < strings.length; j++) {
                    if (strings[i].equals(strings[j])) {
                        strings[j] = null;
                        temp = i;
                    }
                }
            } else {
                continue;
            }
            strings[temp] = null;
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
        scanner.close();
    }
}