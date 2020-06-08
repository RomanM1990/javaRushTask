package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream components;

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
    public AmigoOutputStream(FileOutputStream components) throws FileNotFoundException {
        super(fileName);
        this.components = components;
    }

    public void flush() throws IOException {
        components.flush();
    }


    public void write(int b) throws IOException{
        components.write(b);
    }

    public void write(byte[] b) throws IOException{
        components.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException{
        components.write(b, off, len);
    }

    public void close() throws IOException{
        components.flush();
        String s = "JavaRush © All rights reserved.";
        components.write(s.getBytes());
        components.close();
    }
}
