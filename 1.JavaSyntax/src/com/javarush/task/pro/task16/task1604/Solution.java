package com.javarush.task.pro.task16.task1604;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1983, 4, 9);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        DayOfWeek day;

        if (calendar.getTime().getDay() == 0) {
            day = DayOfWeek.SUNDAY;
        } else {
            day = DayOfWeek.of(calendar.getTime().getDay());
        }
        return day.getDisplayName(TextStyle.FULL, new Locale("ru"));
    }
}
