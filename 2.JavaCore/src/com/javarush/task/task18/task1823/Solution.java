package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        ArrayList<String> list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        while(!(name.equals("exit"))){
            list.add(name);
            ReadThread thread=new ReadThread(name);
            name=reader.readLine();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        HashMap<Byte, Integer> map=new HashMap<>();
        public ReadThread(String fileName) throws InterruptedException {
            this.fileName=fileName;
            start();
            join();//implement constructor body
        }
        public void run(){
            try(FileInputStream fileInputStream=new FileInputStream(fileName)) {
                int i;
                while((i=fileInputStream.read())!= -1){
                    map.compute((byte) i,(k, v)->(v==null) ? 1 : v+1);
                }
                int max=Collections.max(map.values());
                for (Map.Entry<Byte, Integer> entry: map.entrySet()
                     ) {
                    if(entry.getValue()==max) {
                        resultMap.put(fileName, Integer.valueOf(entry.getKey()));
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }// implement file reading here - реализуйте чтение из файла тут
    }
}
