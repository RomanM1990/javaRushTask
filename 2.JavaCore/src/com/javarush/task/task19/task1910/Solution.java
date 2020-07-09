package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        try(
                BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
                BufferedReader fileReader=new BufferedReader(new FileReader(reader.readLine()));
                BufferedWriter fileWriter=new BufferedWriter(new FileWriter(reader.readLine()))
        ){
            while(fileReader.ready()){
                stringBuffer.append(fileReader.readLine()).append(" ");
            }
            fileWriter.write(String.valueOf(stringBuffer).replaceAll("[\\n|\\pP]",""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
