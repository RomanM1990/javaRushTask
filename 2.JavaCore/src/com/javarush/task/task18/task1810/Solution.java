package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        boolean in=true;
        while (in){
            try {
                FileInputStream fileInputStream=new FileInputStream(reader.readLine());
                if(fileInputStream.available()<1000){
                    in=false;
                    reader.close();
                    fileInputStream.close();
                    throw new DownloadException();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
