package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;


    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        strings=new ArrayList<>();

        for (int k=0; k<5;k++)
            strings.add(reader.readLine());
        int max=strings.get(0).length();
        for (int k=1; k<5;k++)
            if (strings.get(k).length()>max) max=strings.get(k).length();//напишите тут ваш код
        for (int k=0;k<strings.size();k++){
            if (strings.get(k).length()==max) System.out.println(strings.get(k));
        }//напишите тут ваш код
    }
}


