package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());
        byte[] array = new byte[file1.available()];
        int count = file1.read(array);

        if (count % 2 != 0) {
            file2.write(array, 0, count/2+1);
            file3.write(array,  count/2+1, count/2);
        } else {
            file2.write(array, 0, count/2);
            file3.write(array, count/2, count/2);
        }

        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
