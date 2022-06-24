package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
В классе Outer есть внутренний (Inner) и вложенный (Nested) классы. В методе main класса Solution создай по одному объекту каждого из них.

Requirements:
1. В методе main класса Solution должен быть создан объект класса Inner.
2. В методе main класса Solution должен быть создан объект класса Nested.
3. Класс Outer изменять нельзя.
*/

public class Solution {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
