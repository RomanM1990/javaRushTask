package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> list=new HashMap<>();
        list.put("арбуз","ягода");
        list.put("банан","трава");//напишите тут ваш код
        list.put("вишня","ягода");//напишите тут ваш код
        list.put("груша","фрукт");//напишите тут ваш код
        list.put("дыня","овощ");//напишите тут ваш код
        list.put("ежевика","куст");//напишите тут ваш код
        list.put("жень-шень","корень");//напишите тут ваш код
        list.put("земляника","ягода");//напишите тут ваш код
        list.put("ирис","цветок");//напишите тут ваш код
        list.put("картофель","клубень");
        for (Map.Entry<String, String> pair: list.entrySet()){
            String key=pair.getKey();
            String value=pair.getValue();
            System.out.println(key+" - "+value);//напишите тут ваш код
        }

    }
}
