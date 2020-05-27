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

    public static void main(String[] args) {
        //args= new String[]{"-c", "Иванов", "м", "04/01/1990", "Иванова", "ж", "18/05/1999"};
        switch (args[0]) {
            case ("-c"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3){
                        Date bd = null;
                        try {
                            bd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[2 + i]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                        if (args[1 + i].equals("м")) {

                            allPeople.add(Person.createMale(args[i], bd));//start here - начни тут
                        } else if (args[1 + i].equals("ж")) {
                            allPeople.add(Person.createFemale(args[i], bd));
                        }
                        System.out.println(allPeople.size() - 1);

                    }
                }
                break;
            case ("-u"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4){
                        Date bd = null;
                        try {
                            bd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3 + i]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        int id = Integer.parseInt(args[i]);
                        allPeople.get(id).setName(args[1 + i]);
                        if (args[2 + i].equals("м")) {
                            allPeople.get(id).setSex(Sex.MALE);
                        } else if (args[2 + i].equals("ж")) {
                            allPeople.get(id).setSex(Sex.FEMALE);
                        }
                        allPeople.get(id).setBirthDate(bd);
                    }
                }
                break;
            case ("-d"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 1){
                        int id = Integer.parseInt(args[i]);
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDate(null);
                    }
                }
                break;
            case ("-i"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 1){
                        int id = Integer.parseInt(args[i]);
                        String name = allPeople.get(id).getName();
                        String sex = allPeople.get(id).getSex().equals(Sex.MALE) ? "м" : "ж";
                        String date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(id).getBirthDate());
                        System.out.println(String.format("%s %s %s", name, sex, date));
                    }
                }
                break;//start here - начни тут
        }
    }
}
