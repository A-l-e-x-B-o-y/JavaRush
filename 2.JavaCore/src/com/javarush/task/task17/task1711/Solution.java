package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; ) {
                        allPeople.add(args[i + 1] == "м" ? Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])) :
                                Person.createFemale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                        System.out.println(allPeople.size() - 1);
                        i += 3;
                    }
                }
                break;

            case "-u" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; ) {
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                        allPeople.get(Integer.parseInt(args[i])).setSex(args[i + 2] == "м" ? Sex.MALE : Sex.FEMALE);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 3]));
                        i += 4;
                    }
                }
                break;

            case "-d" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                    }
                }
                break;

            case "-i" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        System.out.print(allPeople.get(Integer.parseInt(args[i])).getName() + " ");
                        System.out.print((allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.MALE ? "м" : "ж") + " ");
                        System.out.println(new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                    }
                }
                break;
        }
    }
}
