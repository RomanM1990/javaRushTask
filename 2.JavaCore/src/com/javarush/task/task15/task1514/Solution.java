package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{
        labels.put(1.0,"kjk");
        labels.put(2.0,"kjku");
        labels.put(3.0,"kjkjhjh");
        labels.put(4.0,"kj");
        labels.put(5.0,"0-9-09-");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
