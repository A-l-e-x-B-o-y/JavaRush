package com.javarush.task.pro.task13.task1303.task1304;

import java.util.*;

/* 
Переводим итератор в цикл for-each
В классе Solution есть методы printHashSet(HashSet<String>) и printList(ArrayList<String>), которые выводят все элементы
из переданных коллекций — списка и множества — с новой строки. Твоя задача переписать методы на использование цикла for-each.
Метод main не участвует в проверке.

Requirements:
1. В классе Solution должен быть публичный статический метод printHashSet(HashSet<String>) с типом возвращаемого значения void.
2. В классе Solution должен быть публичный статический метод printList(ArrayList<String>) с типом возвращаемого значения void.
3. Метод printHashSet(HashSet<String>) должен выводить все элементы с помощью цикла for-each.
4. Метод printList(ArrayList<String>) должен выводить все элементы с помощью цикла for-each.
*/

public class Solution {

    public static void printList(ArrayList<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
