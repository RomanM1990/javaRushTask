package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        ArrayList<Integer> list=new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(name);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(fileInputStream));
        String line;
        while ((line = reader1.readLine()) != null) {

            if (Integer.parseInt(line)%2==0) list.add(Integer.parseInt(line));
        }

        Collections.sort(list);
        for (Integer x:list){
            System.out.println(x);
        }
        fileInputStream.close();
    }
}