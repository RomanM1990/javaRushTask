package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        int count=0;
        int plus=0;
        for (int i=0;i<1;i++){
            if (a>0)
                plus++;
            if (a<0)
                count++;
            if (b>0)
                plus++;
            if (b<0)
                count++;
            if (c>0)
                plus++;
            if (c<0)
                count++;
            System.out.println("количество отрицательных чисел: "+count);
            System.out.println("количество положительных чисел: "+plus);


        }

        //напишите тут ваш код

    }
}
