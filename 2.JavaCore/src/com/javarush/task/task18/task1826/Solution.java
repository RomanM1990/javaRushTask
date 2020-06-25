package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try(
                FileInputStream fileInputStream=new FileInputStream(args[1]);
                FileOutputStream fileOutputStream=new FileOutputStream(args[2])
        ){
            if(args[0].equals("-e")){
                int i;
                while((i=fileInputStream.read())!=-1){
                    fileOutputStream.write(i+1);
                }
            }
            else if(args[0].equals("-d")){
                int i;
                while((i=fileInputStream.read())!=-1){
                    fileOutputStream.write(i-1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
