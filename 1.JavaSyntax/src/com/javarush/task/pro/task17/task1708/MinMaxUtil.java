package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int a, int b) {
        if (a <= b) return a;
        else return b;
    }

    public static int min(int a, int b, int c) {
        if (min(a, b) <= c) return min(a, b);
        else return c;
    }

    public static int min(int a, int b, int c, int d) {
        if (min(a, b) <= min(c, d)) return min(a, b);
        else return min(c, d);
    }

    public static int min(int a, int b, int c, int d, int e) {
        if (min(a, b, c) <= min(d, e)) return min(a, b, c);
        else return min(d, e);
    }

    public static int max(int a, int b) {
        if (a >= b) return a;
        else return b;
    }

    public static int max(int a, int b, int c) {
        if (max(a, b) >= c) return max(a, b);
        else return c;
    }

    public static int max(int a, int b, int c, int d) {
        if (max(a, b) >= max(c, d)) return max(a, b);
        else return max(c, d);
    }

    public static int max(int a, int b, int c, int d, int e) {
        if (max(a, b, c) >= max(d, e)) return max(a, b, c);
        else return max(d, e);
    }
}
