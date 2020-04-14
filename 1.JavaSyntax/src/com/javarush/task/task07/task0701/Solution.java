package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] chi=new int[20];
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<20;i++){
            chi[i]=Integer.parseInt(reader.readLine());// создай и заполни массив
        }
        return chi;
    }

    public static int max(int[] array) {
        int max=array[0];
        for (int j=0;j<20;j++){
            if (array[j]>max)
                max=array[j];// найди максимальное значение
        }
        return max;
    }
}
