package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] s=new int[10];
        for (int i=0;i<10;i++) s[i]=Integer.parseInt(reader.readLine());
        for (int j=9;j>=0;j--) System.out.println(s[j]);//напишите тут ваш код
    }
}

