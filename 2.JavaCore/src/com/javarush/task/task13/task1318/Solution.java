package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(name);
        int i;

        while((i=fileInputStream.read())!= -1){

            System.out.print((char)i);
        }
        fileInputStream.close();// напишите тут ваш код
    }
}