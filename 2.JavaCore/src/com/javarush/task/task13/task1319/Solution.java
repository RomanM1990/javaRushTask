package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        BufferedWriter writter = new BufferedWriter(new FileWriter(name));
        while(true){
            String e=reader.readLine();
            writter.write(e+"\n");
            if(e.equals("exit")) break;// напишите тут ваш код
        }
        reader.close();
        writter.close();





    }
}
