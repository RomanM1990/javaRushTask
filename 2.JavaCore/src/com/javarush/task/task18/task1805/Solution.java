package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        HashMap<Byte, Integer> byt = new HashMap<>();
        while (fileInputStream.available() > 0) {
            byte data = (byte) fileInputStream.read();
            byt.put(data, 1);
        }
        fileInputStream.close();
        reader.close();
        ArrayList<Byte> list=new ArrayList<>(byt.keySet());
        Collections.sort(list);

        for (Byte entry : list
        ) {
                System.out.print(entry+" ");
        }
    }
}