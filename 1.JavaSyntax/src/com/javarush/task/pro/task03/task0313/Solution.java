package com.javarush.task.pro.task03.task0313;

/*
Сравнение строк по ссылке
В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3 с выводом соответствующего сообщения после каждого сравнения:
"ссылки на строки одинаковые" или "ссылки на строки разные".

Порядок сравнения должен быть следующим:
- строку string1 со строкой string2
- строку string1 со строкой string3
- строку string2 со строкой string3.

Requirements:
1. Поля string1, string2 и string3 и их значения изменять нельзя.
2. В методе main должно быть сравнение строк string1 и string2 по ссылке.
3. В методе main должно быть сравнение строк string2 и string3 по ссылке.
4. В методе main должно быть сравнение строк string1 и string3 по ссылке.
5. Программа должна выводить соответствующие сообщения на экран.
6. Программа должна выводить на экран 3 строки.
 */

public class Solution {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";

        if (string1 == string2) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string1 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string2 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
    }
}
