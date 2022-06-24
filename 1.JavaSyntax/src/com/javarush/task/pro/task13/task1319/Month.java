package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
В enum Month добавь 4 метода: getWinterMonths(), getSpringMonths(), getSummerMonths(), getAutumnMonths() которые будут возвращать массив с тремя месяцами.

Requirements:
1. Публичный статический метод getWinterMonths() должен возвращать массив с зимними месяцами.
2. Публичный статический метод getSpringMonths() должен возвращать массив с весенними месяцами.
3. Публичный статический метод getSummerMonths() должен возвращать массив с летними месяцами.
4. Публичный статический метод getAutumnMonths() должен возвращать массив с осенними месяцами.
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] arrayMonths = new Month[] {DECEMBER, JANUARY, FEBRUARY};
        return arrayMonths;
    }

    public static Month[] getSpringMonths() {
        Month[] arrayMonths = new Month[] {MARCH, APRIL, MAY};
        return arrayMonths;
    }

    public static Month[] getSummerMonths() {
        Month[] arrayMonths = new Month[] {JUNE, JULY, AUGUST};
        return arrayMonths;
    }

    public static Month[] getAutumnMonths() {
        Month[] arrayMonths = new Month[] {SEPTEMBER, OCTOBER, NOVEMBER};
        return arrayMonths;
    }
}
