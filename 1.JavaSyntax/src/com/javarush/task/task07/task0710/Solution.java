package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> string=new ArrayList<>();
        for (int f=0;f<10;f++)
            string.add(0,reader.readLine());
        for (int f=0;f<string.size();f++) System.out.println(string.get(f));//напишите тут ваш код
    }
}
