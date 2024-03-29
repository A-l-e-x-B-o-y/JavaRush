package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a % b == 0) {
            result = b;
        } else {
            while (a % b != 0) {
                int c = a % b;
                a = b;
                result = c;
                b = c;
            }
        }

        System.out.println(result);
    }
}
