package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }
        static  ArrayList<Integer> list=new ArrayList<>();
    public static void readData() {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true){
                list.add(Integer.parseInt(reader.readLine()));//напишите тут ваш код
            }
        } catch (NumberFormatException | IOException e) {
            for(Integer a: list) System.out.println(a);;
        }
    }
}
