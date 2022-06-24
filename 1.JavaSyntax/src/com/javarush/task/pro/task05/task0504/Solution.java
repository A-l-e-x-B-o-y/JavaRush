package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в один массив resultArray.
Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
Программа должна правильно обрабатывать массивы любой длины.


Requirements:
1. В классе Solution должна быть публичная статическая переменная firstArray типа int[], проинициализированная массивом с 10-ю значениями.
2. В классе Solution должна быть публичная статическая переменная secondArray типа int[], проинициализированная массивом с 10-ю значениями.
3. В классе Solution должна быть публичная статическая переменная resultArray типа int[].
4. Реализуй метод main(String[]) согласно условию.
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }

        for (int i = firstArray.length; i < resultArray.length; i++) {
            resultArray[i] = secondArray[i - firstArray.length];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
