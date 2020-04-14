package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lisr=new ArrayList<>();
        while(true){
            String name=reader.readLine();
            if (name.equals("end")) break;
            lisr.add(name);
            //напишите тут ваш код
        }
        for(String x:lisr) System.out.println(x);
    }
}