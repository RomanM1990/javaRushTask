package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        String name1=name.substring(0,name.length()-6);
        while(!(name.equals("end"))){
            list.add(name);
            name=reader.readLine();
        }
        Collections.sort(list);
        for (String x:list
             ) {
            try(
                    FileOutputStream fileOutputStream=new FileOutputStream(name1);
                    FileInputStream fileInputStream=new FileInputStream(x)
            ){
                byte[] buffer=new byte[fileInputStream.available()];
                while(fileInputStream.available()>0){
                    fileInputStream.read(buffer);
                    fileOutputStream.write(buffer);
                }
            }
        }



    }
}
