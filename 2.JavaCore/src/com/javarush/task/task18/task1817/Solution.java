package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(args[0]);
        int i;
        double count0=0.00;
        double count00=0.00;
        while((i=fileInputStream.read())!=-1){
            if((byte) i== 32){
                count0++;
            }
            else {
                count00++;
            }
        }
        fileInputStream.close();
        double relation = count0*100/(count00+count0);
        System.out.printf("%.2f",relation);
    }
}
