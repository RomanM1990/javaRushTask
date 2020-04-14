package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try{
            divideByZero();
        }
        catch (Exception s){
            s.printStackTrace();
        }
    }

    public static void divideByZero() {
        System.out.println(7/0);
    }
}
