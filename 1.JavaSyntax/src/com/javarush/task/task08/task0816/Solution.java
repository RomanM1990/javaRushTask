package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("JUNE 1 1970"));
        map.put("Белуччи", dateFormat.parse("JUNE 1 1970"));
        map.put("Альпачино", dateFormat.parse("JUNE 1 1970 "));
        map.put("ДиКаприо", dateFormat.parse("SEPTEMBER 1 1970"));
        map.put("Деймон", dateFormat.parse("DECEMBER 1 1970"));
        map.put("Шварц", dateFormat.parse("NOVEMBER 1 1970"));
        map.put("Лайвли", dateFormat.parse("JULY 1 1970"));
        map.put("Армстронг", dateFormat.parse("SEPTEMBER 1 1970"));
        map.put("Энрике", dateFormat.parse("MARCH 1 1970"));
        map.put("Кристофер", dateFormat.parse("AUGUST 1 1970"));
        return map;//напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> pa = iterator.next();
            Date dat=pa.getValue();
            if(dat.getMonth()>=5 && pa.getValue().getMonth()<8) iterator.remove();
        }//for( Map.Entry<String, Date> pa : map.entrySet()) if(pa.getValue().getMonth()>=5 && pa.getValue().getMonth()<8) map.remove(pa);//напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
