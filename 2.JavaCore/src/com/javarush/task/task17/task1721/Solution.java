package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String nameFile_1 = reader.readLine();
            String nameFile_2 = reader.readLine();
            reader.close();

            reader = new BufferedReader(new FileReader(nameFile_1));
            while (reader.ready()) {
                allLines.add(reader.readLine());}
            reader = new BufferedReader(new FileReader(nameFile_2));
            while (reader.ready()) {
                forRemoveLines.add(reader.readLine());
            }
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        Solution solution = new Solution();
        solution.joinData();


    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
