package com.javarush.task.pro.task10.task1006;

/* 
Кто тут наследник?
Эта задача нужна для понимания того, как вызывается конструктор базового класса (родителя).
У тебя есть классы ElectricCar, GasCar, HybridCar, которые наследуют класс Car.
Тебе нужно в конструкторах наследников класса Car передать тип автомобиля в конструктор базового класса (родителя),
используя super("тип автомобиля"). Для этого в классе Solution в методе main создай 3 объекта: HybridCar, GasCar и ElectricCar.

Вывод должен быть следующий (последовательность может быть любая):
Привет. Я ElectricCar
Привет. Я GasCar
Привет. Я HybridCar

Requirements:
1. Классы ElectricCar, GasCar, HybridCar должны наследоваться от класса Car.
2. Тело конструктора класса Car не изменяй.
3. Наследники класса Car должны вызывать конструктор базового класса с соответствующим аргументом.
4. В методе main должно быть создано 3 объекта классов HybridCar, GasCar и ElectricCar.
5. Вывод должен соответствовать условию.
*/

public class Solution {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        GasCar gasCar = new GasCar();
        HybridCar hybridCar = new HybridCar();
    }
}
