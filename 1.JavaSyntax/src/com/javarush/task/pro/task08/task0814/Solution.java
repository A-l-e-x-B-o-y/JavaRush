package com.javarush.task.pro.task08.task0814;

/* 
Флаги
Реализуй методы:

setFlag(int number, int flagPos) — устанавливает значение "1" биту под индексом flagPos числа number и возвращает новое значение.
resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos числа number и возвращает новое значение.
checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos числа number и возвращает true, если значение "1" и false, если "0".

Requirements:
1. Реализуй метод setFlag(int, int) согласно условию.
2. Реализуй метод resetFlag(int, int) согласно условию.
3. Реализуй метод checkFlag(int, int) согласно условию.
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        number |= (1 << flagPos);
        return number;
    }

    public static int resetFlag(int number, int flagPos) {
        number = number &~ (1 << flagPos);
        return number;
    }

    public static boolean checkFlag(int number, int flagPos) {
        if ((number & (1 << flagPos)) == (1 << flagPos)) {
            return true;
        } else {
            return false;
        }
    }
}
