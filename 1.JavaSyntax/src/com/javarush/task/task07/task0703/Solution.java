package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] s=new String[10];
        int[] s1=new int[10];
        for (int i=0;i<10;i++){
            s[i]=reader.readLine();//напишите тут ваш код
        }
        for (int j=0; j<10;j++){
            s1[j]=s[j].length();
        }
        for (int j=0;j<10;j++){
            System.out.println(s1[j]);
        }
    }
}
