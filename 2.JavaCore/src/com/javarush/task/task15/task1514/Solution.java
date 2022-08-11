package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(12.5, "Gray");
        labels.put(27.7, "Red");
        labels.put(91.04, "Black");
        labels.put(37.42, "Green");
        labels.put(2.5, "Pink");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
