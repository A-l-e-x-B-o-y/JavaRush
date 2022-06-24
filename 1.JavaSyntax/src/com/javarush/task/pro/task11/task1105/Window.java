package com.javarush.task.pro.task11.task1105;

/* 
Оконные работы
В классе Window есть метод changeSize, который должен менять размеры окна на значения, переданные в метод.
Но если ты запустишь программу, то убедишься, что этот метод не работает. Тебе нужно исправить ошибки так, чтобы метод заработал.

Requirements:
1. Объявление и инициализацию полей класса Window изменять нельзя.
2. Метод changeSize класса Window должен изменять значения полей класса согласно переданным данным.
3. Объявление метода changeSize и названия параметров изменять нельзя.
*/

public class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void printSize(){
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}
