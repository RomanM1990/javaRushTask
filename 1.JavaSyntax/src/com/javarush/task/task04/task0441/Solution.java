package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(bufferedReader.readLine());//напишите тут ваш код
        int b=Integer.parseInt(bufferedReader.readLine());//напишите тут ваш код
        int c=Integer.parseInt(bufferedReader.readLine());
        if (a>=b && a>=c){
            if (b>=c)
                System.out.println(b);
            else System.out.println(c);}
        else if (b>=a && b>=c){
            if (a>=c)
                System.out.println(a);
            else System.out.println(c);}
        else if (c >= a){
            if (a>=b)
                System.out.println(a);
            else System.out.println(b);}

        //напишите тут ваш код

    }
}
