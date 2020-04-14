package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings=new ArrayList<>();

        for (int k=0; k<5;k++)
            strings.add(reader.readLine());
        int mi=strings.get(0).length();
        for (int k=1; k<5;k++)
            if (strings.get(k).length()<mi) mi=strings.get(k).length();//напишите тут ваш код
        for (int k=0;k<strings.size();k++){
            if (strings.get(k).length()==mi) System.out.println(strings.get(k));
        }//напишите тут ваш код//напишите тут ваш код
    }
}
