package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();

        String id=args[0];
        //int x=id.length();
        try(BufferedReader reader1=new BufferedReader(new FileReader(name))){
            String line;
            while ((line=reader1.readLine())!=null){
                if(line.startsWith(id+" ")){
                    System.out.println(line);
                }
            }
        }
    }
}
