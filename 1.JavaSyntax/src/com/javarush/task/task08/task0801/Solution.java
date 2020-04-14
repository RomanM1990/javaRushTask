package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> Set=new HashSet<>();
        Set.add("арбуз");//напишите тут ваш код
        Set.add("банан");//напишите тут ваш код
        Set.add("вишня");//напишите тут ваш код
        Set.add("груша");//напишите тут ваш код
        Set.add("дыня");//напишите тут ваш код
        Set.add("ежевика");//напишите тут ваш код
        Set.add("женьшень");//напишите тут ваш код
        Set.add("земляника");//напишите тут ваш код
        Set.add("ирис");//напишите тут ваш код
        Set.add("картофель");
        for(String x:Set) System.out.println(x);//напишите тут ваш код

    }
}
