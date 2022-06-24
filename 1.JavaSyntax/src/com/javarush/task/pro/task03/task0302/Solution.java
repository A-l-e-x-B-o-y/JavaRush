package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно), то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.

Пример ввода:
Amigo
18
Пример вывода:
Amigo, явитесь в военкомат


Requirements:
1. Программа должна считывать данные с клавиатуры два раза.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если возраст в пределах 18-28 (включительно), то вывести только сообщение "Имя, явитесь в военкомат".
4. Если возраст не находится в указанных пределах, то ничего выводить не нужно.
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
