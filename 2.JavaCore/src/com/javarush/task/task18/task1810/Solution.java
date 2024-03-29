package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static boolean isClose = false;

    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file;

        while (!isClose) {
            file = new FileInputStream(reader.readLine());
            if (file.available() < 1000) {
                file.close();
                reader.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {
        public DownloadException() {
            isClose = true;
        }
    }
}
