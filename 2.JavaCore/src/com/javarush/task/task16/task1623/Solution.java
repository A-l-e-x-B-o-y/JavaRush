package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        @Override
        public void run() {
            if (count > createdThreadCount) {
                System.out.println(new GenerateThread());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            this.start();
        }

        @Override
        public String toString() {
            return this.getName() + " created";
        }
    }
}
