package com.javarush.task.pro.task16.task1601;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(83, 4, 8);;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        DayOfWeek day;
        if (date.getDay() == 0) {
            day = DayOfWeek.SUNDAY;
        } else {
            day = DayOfWeek.of(date.getDay());
        }
        return day.getDisplayName(TextStyle.FULL, new Locale("ru"));
    }
}
