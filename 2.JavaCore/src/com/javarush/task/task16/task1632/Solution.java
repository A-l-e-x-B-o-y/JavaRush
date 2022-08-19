package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthThread());
    }

    public static void main(String[] args) {
    }

    public static class FirstThread extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class SecondThread extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThirdThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static class FourthThread extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
            }
        }
    }

    public static class FifthThread extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        @Override
        public void run() {
            String word = "";
            while (true) {
                try {
                    word = reader.readLine();
                    sum += Integer.parseInt(word);
                } catch (Exception e) {
                    if (word.equals("N")) {
                        break;
                    } else {
                        System.out.println("Введено не числовое значение.");
                    }
                }
            }
            System.out.println(sum);
        }
    }
}