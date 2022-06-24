package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
Реализуй метод main(String[]), который выводит в консоль true, если элемент содержится в переданном массиве, иначе — false.
Массив array не должен изменять расположение своих элементов.

Для поиска элемента в массиве нужен бинарный поиск. Чтобы это сделать, используй статический метод Arrays.binarySearch(int[], int) класса Arrays.
Первым параметром нужно передать отсортированный массив, в котором выполнить поиск, вторым параметром — искомый элемент.
Метод Arrays.binarySearch(int[], int) возвращает индекс искомого элемента, если такой элемент есть в массиве.

Для сортировки массива можно использовать метод Arrays.sort(int[]).
При тестировании значения переменных класса Solution будут разными.


Requirements:
1. В методе main(String[]) не изменяй расположение элементов массива array.
2. При вызове метода main(String[]) вывести в консоли true, если значение переменной element содержится в массиве.
3. При вызове метода main(String[]) вывести в консоли false, если переданный элемент не содержится в массиве.
4. В методе main(String[]) используй вызов метода Arrays.binarySearch(int[], int).
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] arrayMy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayMy);
        if (Arrays.binarySearch(arrayMy, element) >= 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
