package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int count;
        if (a>1){

                int b=Integer.parseInt(reader.readLine());
                count=b;
            for (int i=1;i<a; i++) {
                int c=Integer.parseInt(reader.readLine());
                count = count > c ? count : c;
            }
            int maximum =count ;
            System.out.println(maximum);

        }
        else if (a==1){
            int b=Integer.parseInt(reader.readLine());
            System.out.println(b);

        }




        //напишите тут ваш код


    }
}
