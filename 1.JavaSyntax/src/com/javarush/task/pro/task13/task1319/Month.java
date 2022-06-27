package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
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
