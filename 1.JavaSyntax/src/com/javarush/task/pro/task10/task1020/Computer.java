package com.javarush.task.pro.task10.task1020;

/*
Собираем компьютер
Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь. В классе компьютер в конструкторе создай объекты классов-составляющих компьютера.

Requirements:
1. В отдельных файлах должны быть публичные классы Computer, Keyboard, Monitor, Mouse, SystemUnit.
2. В конструкторе класса Computer нужно создать 4 объекта разных "комплектующих".
*/

public class Computer {

    public Computer() {
        SystemUnit systemUnit = new SystemUnit();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();
    }
}
