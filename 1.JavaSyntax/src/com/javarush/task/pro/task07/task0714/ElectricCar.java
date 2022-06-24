package com.javarush.task.pro.task07.task0714;

/* 
Наследование переменных
Правильно унаследуй классы:

машину — от транспортного средства;
электрокар — от машины.
Удали дублирующиеся переменные.

Requirements:
1. Класс Car должен наследоваться от класса Vehicle.
2. Класс ElectricCar должен наследоваться от класса Car.
3. Дублирующих переменных не должно быть.
*/

public class ElectricCar extends Car {
    int electricEnginePower;
}
