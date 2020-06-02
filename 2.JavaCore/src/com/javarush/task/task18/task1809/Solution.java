package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Byte> list=new ArrayList<>();
       Byte[] arrayOfStrings = null;

        try {
            String file_1=reader.readLine();
            String file_2=reader.readLine();
            FileInputStream fileInputStream=new FileInputStream(file_1);
            FileOutputStream fileoutputStream = new FileOutputStream(file_2);
            while(fileInputStream.available()>0){
                byte byt= (byte) fileInputStream.read();
                list.add(byt);
            }
            Collections.reverse(list);
            for (int i=0; i<list.size();i++) {

                fileoutputStream.write(list.get(i));

            }
            fileInputStream.close();
            fileoutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
