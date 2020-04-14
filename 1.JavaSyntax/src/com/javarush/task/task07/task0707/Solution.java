package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        for (int j=0;j<5;j++) list.add("toString(j)");
        System.out.println(list.size());
        for (int j=0;j<list.size();j++) System.out.println(list.get(j));//напишите тут ваш код
    }
}
