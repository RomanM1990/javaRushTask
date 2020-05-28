package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileInputStream=new FileInputStream(reader.readLine());
            ArrayList<Integer> list=new ArrayList<>();
            while (fileInputStream.available() > 0){
                list.add(fileInputStream.read());
            }
            fileInputStream.close();
            reader.close();
            System.out.println(Collections.max(list));
    }
}
