package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name1=reader.readLine();
        String name2=reader.readLine();
        String name3=reader.readLine();
        reader.close();

        FileOutputStream fileOutputStream=new FileOutputStream(name1);
        //int x=0;
        try( FileInputStream fileInputStream=new FileInputStream(name2)) {
            byte[] buffer = new byte[fileInputStream.available()];
            while (fileInputStream.available() > 0){
                int count = fileInputStream.read(buffer);
                fileOutputStream.write(buffer,0,count);
               // x=count;
            }
        }

        try (FileInputStream fileInputStream1=new FileInputStream(name3)){
            byte[] buffer1 = new byte[fileInputStream1.available()];
            while (fileInputStream1.available()>0){
                int count1 = fileInputStream1.read(buffer1);
                fileOutputStream.write(buffer1,0,count1);
        }

        }
        fileOutputStream.close();
    }
}
