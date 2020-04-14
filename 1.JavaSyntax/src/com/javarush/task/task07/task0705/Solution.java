package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] s=new int[20];
        int[] s1=new int[10];
        int[] s2=new int[10];
        for (int i=0;i<20;i++) s[i]=Integer.parseInt(reader.readLine());
        for (int j=0;j<10;j++) s1[j]=s[j];
        for(int j=0;j<10;j++) s2[j]=s[j+10];
        for(int j=0;j<10;j++) System.out.println(s2[j]);

        //напишите тут ваш код
    }
}
