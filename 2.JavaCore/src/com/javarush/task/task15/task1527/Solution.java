package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();
        String[] line=URL.substring(URL.indexOf("?")+1).split("&");
        for (String x: line
             ) {
            if(x.contains("=")) System.out.print(x.substring(0, x.indexOf("="))+" ");
            else System.out.print(x+" ");
        }
        System.out.println();
        for (String x: line
            ) {
            if(x.contains("obj")){ try{alert(Double.parseDouble( x.substring(x.indexOf("=")+1)));}
            catch (Exception e){alert(x.substring(x.indexOf("=")+1));}

            }
        }
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
