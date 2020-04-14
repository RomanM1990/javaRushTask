package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map=new HashMap<>();
        for(int a=0;a<10;a++) map.put("fgd"+a,"dfgdg"+a);
        return map;//напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
            List valueList = new ArrayList(map.values());
            for(int i = 0; i < valueList.size()  ; i++) {
                for(int j = i+1; j < valueList.size(); j++) {
                    if (valueList.get(i).equals(valueList.get(j))) {
                        removeItemFromMapByValue(map, (String) valueList.get(i));
                    }
                }
            }
        }





    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
