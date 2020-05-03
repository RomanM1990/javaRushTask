package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String name=reader.readLine();
            if (name.equals("exit")) break;
            try{if(name.contains(".")) print(Double.parseDouble(name));
                else if(!(name.contains("."))){int s=Integer.parseInt(name);
                if (s<=0 || s>=128) print(s);
                else print((short) s);}
            }
            catch (Exception e){
                print(name);
            }
            //напиште тут ваш код
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
