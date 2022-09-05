package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
       switch (args[0]) {
            case "-c" :
                if (args[2].equals("м")) {
                        allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
                } else if (args[2].equals("ж")) {
                    allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
                }
                System.out.println(allPeople.size()-1);
                break;
            case "-r" :
                try {
                    System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() + " " +
                            (allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.MALE ? "м" : "ж") + " " +
                            new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Человека с таким id нету в списке.");
                }
                break;
            case "-u" :
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                if (args[3].equals("м")) {
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                } else {
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                }
                try {
                    allPeople.get(Integer.parseInt(args[1])).setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(args[4]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case "-d" :
                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                break;
            default :
                System.out.println("Что-то пошло не так.");
        }
    }
}
