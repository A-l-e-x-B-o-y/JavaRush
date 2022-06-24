package com.javarush.task.pro.task09.task0901;

/* 
Целочисленные литералы
В классе Solution объявлены четыре публичных поля, которые соответствуют четырем целочисленным типам. При объявлении эти поля инициализируются разными значениями — целочисленными литералами.
Но программа не компилируется, и нужно это исправить. Для этого внеси минимальные изменения в значения полей так, чтобы тип переменной соответствовал типу целочисленного литерала.
Можно изменять только знак и тип литерала, не изменяя цифры и их порядок.

Requirements:
1. Измени литерал инициализации поля b согласно условию.
2. Измени литерал инициализации поля s согласно условию
3. Измени литерал инициализации поля i согласно условию
4. Измени литерал инициализации поля l согласно условию
*/

public class Solution {
    public byte b = -128;
    public short s = -32768;
    public int i = 1_234_567_890;
    public long l = 2_345_678_900L;
}
