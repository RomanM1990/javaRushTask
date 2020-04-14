package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int chet=0;
        int nechet=0;
        int[] s=new int[15];
        for(int j=0; j<15;j++){
            s[j]=Integer.parseInt(reader.readLine());
            if (j%2==0) chet+=s[j];
            else nechet+=s[j];
            //напишите тут ваш код
        }
        String a="В домах с нечетными номерами проживает больше жителей.";
        String b="В домах с четными номерами проживает больше жителей.";
        System.out.println(chet>nechet ? b : a);
    }
}
