package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        while(true) {
            String name = null;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ) {
                name = reader.readLine();
                new FileInputStream(name).close();
            } catch (FileNotFoundException e) {
                System.out.println(name);
                return;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
