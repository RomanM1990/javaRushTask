package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    static String name;
    static int age;
    public Solution(String name){this.name=name;}
    Solution(){};
    protected Solution(int age){this.age=age;}
    private Solution(String name, int age){
        this(name);
        this.age=age;
    }
    public static void main(String[] args) {

    }
}

