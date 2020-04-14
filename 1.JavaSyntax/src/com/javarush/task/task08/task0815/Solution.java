package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String>list=new HashMap<>();
        for(int i=0;i<10;i++) list.put("werwr"+i,"werwer"+i);
        return list;//напишите тут ваш код

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count=0;
        for(Map.Entry<String, String> pair: map.entrySet()) if(pair.getValue().equals(name)) count++;
        return count;//напишите тут ваш код

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count=0;
        for(Map.Entry<String, String> pair: map.entrySet()) if(pair.getKey().equals(lastName)) count++;
        return count;//напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
