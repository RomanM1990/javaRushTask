package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String string=reader.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
        Date date = dateFormat.parse(string);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat2.format(date).toUpperCase());//напишите тут ваш код
    }
}
