package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length != 0) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            ArrayList<String> list = new ArrayList<>();
            try (
                    BufferedReader input = new BufferedReader(new FileReader(fileName));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))
            ) {
                String bufferID;
                while ((bufferID = input.readLine()) != null) list.add(bufferID);
                switch (args[0]) {
                    case "-u":
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).substring(0, 8).trim().equals(args[1])) {
                                list.set(i, String.format("%-8.8s%-30.30s%-8.8s%-4.4s", args[1], args[2], args[3], args[4]));
                            }
                        }
                        break;
                    case "-d":
                        list.removeIf(s -> s.substring(0, 8).trim().equals(args[1]));
                        break;
                }
                for (String line : list) {
                    if (line != null) {
                        line+="\n";
                        writer.write(line);
                    }
                }
            }
        }
    }
}

