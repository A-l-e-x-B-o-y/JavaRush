package com.javarush.task.pro.task08.task0801;

import static java.lang.Math.toRadians;

/* 
Утильный класс: часть 1
Реализуй методы sin(double), cos(double), tan(double) которые возвращают синус, косинус и тангенс угла соответственно, полученного как параметр. Угол задан в градусах.
В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.

Requirements:
1. Реализуй метод sin(double) согласно условию.
2. Реализуй метод cos(double) согласно условию.
3. Реализуй метод tan(double) согласно условию.
*/

public class Solution {

    public static double sin(double a) {

        return Math.sin(toRadians(a));
    }

    public static double cos(double a) {
        return Math.cos(toRadians(a));
    }

    public static double tan(double a) {
        return Math.tan(toRadians(a));
    }
}
