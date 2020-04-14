package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        for (int i=1;i<a+1;i++){
            for (int j=1;j<b+1;j++){
                System.out.print("8");//напишите тут ваш код
            }
            System.out.println();
        }

    }
}
