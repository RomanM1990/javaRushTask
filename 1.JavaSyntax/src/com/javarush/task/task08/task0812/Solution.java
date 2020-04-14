package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(Integer.parseInt(reader.readLine()));//напишите тут ваш код
        }
        int count=1;
        for (int i=0;i<9;i++){
            if (i==8 && list.get(i).equals(list.get(i+1))){ count++;list1.add(count);}
            if (list.get(i).equals(list.get(i+1))) count++;
            else { list1.add(count); count=1;}
        }
        int max=list1.get(0);
        for (int i=1; i<list1.size(); i++) if (list1.get(i)>max) max=list1.get(i);
        System.out.println(max);


    }
}