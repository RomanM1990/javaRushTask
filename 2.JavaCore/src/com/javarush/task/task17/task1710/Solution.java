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

    public static void main(String[] args) {

        switch (args[0]){
            case("-c"):
                Date bd = null;
                try {
                    bd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                if(args[2].equals("м")){

                    allPeople.add(Person.createMale(args[1], bd));//start here - начни тут
                }
                else if(args[2].equals("ж")){
                    allPeople.add(Person.createFemale(args[1], bd));
                }
                System.out.println(allPeople.size() - 1);
                break;
            case("-u"):
                bd = null;
                try {
                    bd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                int id=Integer.parseInt(args[1]);
                allPeople.get(id).setName(args[2]);
                if(args[3].equals("м")){
                    allPeople.get(id).setSex(Sex.MALE);
                }
                else if(args[3].equals("ж")){
                    allPeople.get(id).setSex(Sex.FEMALE);
                }
                allPeople.get(id).setBirthDate(bd);
                break;
            case("-d"):
                id = Integer.parseInt(args[1]);
                allPeople.get(id).setName(null);
                allPeople.get(id).setSex(null);
                allPeople.get(id).setBirthDate(null);
                break;
            case("-i"):
                id = Integer.parseInt(args[1]);
                String name=allPeople.get(id).getName();
                String sex=allPeople.get(id).getSex().equals(Sex.MALE)? "м" : "ж";
                String date=new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(id).getBirthDate());
                System.out.println(String.format("%s %s %s",name,sex, date));

        }
    }
}
