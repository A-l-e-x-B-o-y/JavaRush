package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Стек в домашних условиях
В классе MyStack нужно реализовать свою версию структуры хранения данных стек на базе ArrayList.
Все элементы хранятся в приватном списке storage. Твоя задача реализовать все объявленные методы класса MyStack.
Где метод push(String) добавляет элемент в начало списка storage. Метод pop() возвращает первый элемент списка storage,
а потом удаляет его из этого списка. Метод peek() возвращает первый элемент списка storage.
Метод empty() проверяет, не пустой ли список storage. Метод search(String) ищет элемент в списке storage и возвращает
его индекс. Если элемента нет в списке — возвращает -1.

Requirements:
1. Метод push(String) должен быть реализован согласно условию.
2. Метод pop() должен быть реализован согласно условию.
3. Метод peek() должен быть реализован согласно условию.
4. Метод empty() должен быть реализован согласно условию.
5. Метод search(String) должен быть реализован согласно условию.
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        //напишите тут ваш код
    }

    public String pop() {
        //напишите тут ваш код
    }

    public String peek() {
        //напишите тут ваш код
    }

    public boolean empty() {
        //напишите тут ваш код
    }

    public int search(String s) {
        //напишите тут ваш код
    }
}
