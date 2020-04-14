package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] s=new String[10];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<8;i++){
            s[i]=reader.readLine();//напишите тут ваш код
        }
        for (int j=9;j>=0;j--){
            System.out.println(s[j]);
        }
    }
}