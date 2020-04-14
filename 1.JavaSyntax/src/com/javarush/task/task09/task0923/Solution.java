package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        char [] ch = r.readLine().toCharArray();

        ArrayList<Character> vow = new ArrayList<>();
        ArrayList<Character> consonant = new ArrayList<>();   //дебаггер доходит до этой строки и дальше перестает читать код

        for (int i=0; i<ch.length; i++) {
            if (isVowel(ch[i])) {
                vow.add(ch[i]);//напишите тут ваш код
            } else if (ch[i]!=' ') {
                consonant.add(ch[i]);
            }
        }

        for (int i=0; i<vow.size(); i++) {
            System.out.print(vow.get(i) + " ");
        }
        System.out.println();
        for (int i=0; i<consonant.size(); i++) {
            System.out.print(consonant.get(i) + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
