package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        if(args.length > 0) {
            if ("-c".equals(args[0]) && args[1] != null) {
                try(
                        BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
                        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))
                ){
                String bufferID;
                int count = 0;
                while ((bufferID = readerFile.readLine()) != null){
                    int newID = Integer.parseInt(bufferID.substring(0,8).trim());
                    if (newID > count) count = newID;
                }
                writer.write(String.format("%n%-8d%-30s%-8s%-4s",++count, args[1], args[2], args[3]));}
            }
        }
    }
}

