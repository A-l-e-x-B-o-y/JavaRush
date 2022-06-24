package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    /*public void print() {
        for (String temp : elements) {
            System.out.print(temp + "\t");
        }
    }*/

    private void grow() {
        String[] temp = Arrays.copyOf(elements, elements.length);
        elements = new String[capacity + (capacity / 2)];

        for (int i = 0; i < capacity; i++) {
            elements[i] = temp[i];
        }
        capacity = elements.length;
    }

}
