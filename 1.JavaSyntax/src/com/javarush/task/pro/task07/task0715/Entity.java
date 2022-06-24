package com.javarush.task.pro.task07.task0715;

/* 
Наследование методов
Правильно унаследуй классы:

человека — от существа;
Java-девелопера — от человека.
Удали дублирующие методы.

Requirements:
1. Класс Human должен наследоваться от класса Entity.
2. Класс JavaDeveloper должен наследоваться от класса Human.
3. Дублирующих методов не должно быть.
*/

public class Entity {
    public void move(){
        System.out.println("Я передвигаюсь.");
    }

    public void eat(){
        System.out.println("Я ем.");
    }
}
