package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public volatile static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string;

        while (!(string = reader.readLine()).equals("exit")) {
            new ReadThread(string).start();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        int[] list = new int[256];

        @Override
        public void run() {
            FileReader file = null;
            try {
                file = new FileReader(fileName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while (true) {
                try {
                    if (!file.ready()) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                int symbol = 0;
                try {
                    symbol = file.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                list[symbol]++;
            }

            resultMap.put(fileName, sort(list));
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public ReadThread(String fileName) throws FileNotFoundException {
            this.fileName = fileName;
        }

        public int sort(int[] list) {
            int itsHe = 0;
            int maxCountByte = 0;
            for (int i = 0; i < list.length; i++) {
                if (list[i] > maxCountByte) {
                    maxCountByte = list[i];
                    itsHe = i;
                }

            }

            return itsHe;
        }
    }
}
