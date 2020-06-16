package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name1=reader.readLine();
        String name2=reader.readLine();
        reader.close();
        try(
                BufferedReader reader1=new BufferedReader(new FileReader(name1));
                FileOutputStream fileOutputStream=new FileOutputStream(name2)
        ){
            String[] line = reader1.readLine().split(" ");
            for (String x: line
                 ) {
                int result= (int) Math.round(Float.parseFloat(x));
                String Line=String.valueOf(result);
                Line+=" ";
                fileOutputStream.write(Line.getBytes());
                Line="";
            }
            }
        }
}
