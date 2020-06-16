package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String name=args[0];
        HashMap<Character, Integer> map=new HashMap<>();
        ArrayList<Character> list=new ArrayList<>();
        try(FileInputStream fileInputStream=new FileInputStream(name)){
            int i;
            while((i=fileInputStream.read())!=-1){
                list.add((char)i);
            }
            for (Character x:list
                 ) {
                map.put(x,map.getOrDefault(x,0)+1);
            }
            Set<Character> keys = map.keySet();
            List<Character> sortedList = new ArrayList<>(keys);
            Collections.sort(sortedList);
            for (Character x: sortedList
                 ) {
                System.out.printf("%s %d%n",x,map.get(x) );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
