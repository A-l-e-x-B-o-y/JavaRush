package com.javarush.task.pro.task03.task0304;

import java.util.Scanner;

/* 
Измерим температуру тела
Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том, что температура тела высокая, низкая или нормальная, в зависимости от условий.
В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая), в которые нужно вынести соответствующие условия и вместо выражений сравнения использовать эти переменные.


Requirements:
1. Программа должна считывать значение температуры c клавиатуры.
2. Не изменяй объявление переменных isHigh и isLow.
3. Переменным isHigh и isLow в методе main должны быть присвоены соответствующие выражения сравнения.
4. Вместо выражений сравнения в операторах if () должны быть использованы переменные isHigh и isLow.
5. Функционал программы не должен измениться.
*/

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();

        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;

        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
        scanner.close();
    }
}
