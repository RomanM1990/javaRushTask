package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        while (true) {
            int a=Integer.parseInt(reader.readLine());
            count+=a;
            if (a==-1){
                System.out.println(count);
                break;}//напишите тут ваш код
        }

    }
}
