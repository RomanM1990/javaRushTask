package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        try(
                BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
                BufferedReader fileReader=new BufferedReader(new FileReader(reader.readLine()))
        ) {
            StringBuffer stringBuffer = new StringBuffer();
            String as;
            while ((as=fileReader.readLine())!=null){
                stringBuffer.append(as+" ");
            }
            String names= String.valueOf(stringBuffer);
            String[] strings = names.split("\\W");
            int count = 0;
            for (String s : strings
            ) {
                if (s.equals("world")) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
