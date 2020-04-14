package com.javarush.task.task08.task0818;

import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> fio= new HashMap<>();
        fio.put("Иванов", 100);
        fio.put("Петров", 278);
        fio.put("Сидоров", 350);
        fio.put("Надеин", 15000);
        fio.put("Харламова", 3900);
        fio.put("Проскуряков", 499);
        fio.put("Микрухин", 5000);
        fio.put("Ярцев", 3500);
        fio.put("Корнюшина", 4000);
        fio.put("Бесламбеков", 300);
        return fio;//напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> pa = iterator.next();
            Integer a=pa.getValue();
            if(a<500) iterator.remove();
        }//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}