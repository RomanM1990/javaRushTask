package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
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
            byt.put(data, byt.getOrDefault(data, 0) + 1);
        }
        fileInputStream.close();
        reader.close();
        Integer minValue = Collections.min(byt.values());

        for (Map.Entry<Byte, Integer> entry : byt.entrySet()
        ) {
            if (entry.getValue().equals(minValue)) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
