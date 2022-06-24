package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
В методе main создаются два айфона с одинаковыми параметрами.
В консоли выводится результат их сравнения. Разберись, почему сейчас результат отрицательный и сделай так, чтобы он был положительным.
Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.

Requirements:
1. В классе Iphone должен быть переопределен метод public boolean equals(Object).
2. Метод equals должен возвращать true для двух равных объектов типа Iphone и false — для разных.
3. Метод equals должен возвращать false, если в него передали null.
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object item) {
        if (item == null) return false;
        if (!(item instanceof Iphone)) return false;
        Iphone phone = (Iphone) item;

        return (this.model == phone.model && this.color == phone.color && this.price == phone.price);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
