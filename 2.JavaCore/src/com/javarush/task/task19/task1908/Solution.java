package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try(
                BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
                BufferedReader fileReader=new  BufferedReader(new FileReader(reader.readLine()));
                BufferedWriter fileWriter=new BufferedWriter(new FileWriter(reader.readLine()))
        ) {
            while (fileReader.ready()){
                String[] strings = fileReader.readLine().split(" ");
                for (String s: strings
                ) {
                    if(s.matches("\\b\\d+\\b")){
                        fileWriter.write(s+" ");
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
