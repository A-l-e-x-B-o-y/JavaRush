package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
Слово "enough" выводить не нужно.
Для этого необходимо использовать бесконечный цикл (while(true)).

Подсказка: чтобы завершить бесконечный цикл, используй оператор break.


Requirements:
1. Программа должна считывать данные c клавиатуры.
2. В программе необходимо использовать цикл while.
3. Для завершения бесконечного цикла необходимо использовать оператор break.
4. Программа должна выводить в консоли все введенные данные с новой строки, пока на будет введено слово "enough".
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("enough")) break;
            else System.out.println(word);
        }
    }
}