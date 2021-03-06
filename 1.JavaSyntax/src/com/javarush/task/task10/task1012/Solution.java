package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        HashMap<Character, Integer> countCharacter = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            countCharacter.put(alphabet.get(i), 0);
        }
        for (int i = 0; i < list.size(); i++) {
            char[] tmp = list.get(i).toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                if(alphabet.contains(tmp[j]))
                countCharacter.put(tmp[j], countCharacter.get(tmp[j]) + 1);
            }
        }
        for (int i = 0; i < alphabet.size(); i++) {
            if (i == alphabet.size() - 1) {
                System.out.print(alphabet.get(i) + " " + countCharacter.get(alphabet.get(i)));
            } else
                System.out.println(alphabet.get(i) + " " + countCharacter.get(alphabet.get(i)));


        }
    }
}