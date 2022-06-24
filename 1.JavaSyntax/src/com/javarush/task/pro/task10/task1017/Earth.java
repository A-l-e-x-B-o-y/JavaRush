package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
Как известно, на планете Земля есть 6 материков. Создай для каждого материка собственный класс. В каждом классе должно быть поле, которое хранит площадь соответствующего материка.
Площадь материка нужно указывать при его создании, и она должна быть неизменяемой.
Ты можешь использовать любые числа для задания площади материков.

Requirements:
1. В отдельных файлах создай публичные классы Africa, Antarctica, Australia, Eurasia, NorthAmerica, SouthAmerica.
2. В каждом из созданных классов должно быть private final int поле area.
3. В каждом из созданных классов должен быть публичный конструктор с аргументом типа int, который будет инициализировать поле area.
4. В методе main класса Earth создай 6 разных материков и передай в них значения площадей.
*/

public class Earth {
    public static void main(String[] args) {
        SouthAmerica southAmerica = new SouthAmerica(100);
        NorthAmerica northAmerica = new NorthAmerica(100);
        Eurasia eurasia = new Eurasia(100);
        Australia australia = new Australia(100);
        Antarctica antarctica = new Antarctica(100);
        Africa africa = new Africa(100);
    }
}