package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream(args[0]);
        ArrayList<Byte> list=new ArrayList<>();
        int i;
        while((i=fileReader.read())!= -1){
            list.add( (byte) i);
        }
        int count=0;
        for (byte x : list) {
            if ((x > 96 && x < 123)||(x > 64 && x < 91)) {
                count++;
            }
        }
        fileReader.close();
        System.out.println(count);
    }
}
