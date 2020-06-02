package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String file_1=reader.readLine();
        String file_2=reader.readLine();
        String file_3=reader.readLine();
        FileInputStream inputStream = new FileInputStream(file_1);
        FileOutputStream outputStream_2 = new FileOutputStream(file_2);
        FileOutputStream outputStream_3 = new FileOutputStream(file_3);
        int byt=inputStream.available();

        if (byt > 0){
            byte[] buffer = new byte[byt];
            int count=inputStream.read(buffer);
            int a=count/2+count%2;
            int b = count - a;
            outputStream_2.write(buffer,0,a);
            outputStream_3.write(buffer,a,b);


        }
        reader.close();
        inputStream.close();
        outputStream_2.close();
        outputStream_3.close();
    }
}
