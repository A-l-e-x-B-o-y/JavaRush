package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] line = fileScanner.nextLine().split(" ");
            GregorianCalendar calendar = new GregorianCalendar(Integer.parseInt(line[5]), Integer.parseInt(line[4])-1, Integer.parseInt(line[3]));
            Date date = calendar.getTime();

            return new Person(line[1], line[2], line[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
