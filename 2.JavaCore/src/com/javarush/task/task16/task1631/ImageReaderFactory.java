package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import java.awt.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes x) {
        ImageReader reader1 = null;
        if(x!=(null)){



        try {
            switch (x) {
                case BMP:
                    reader1= new BmpReader();
                    break;
                case JPG:
                    reader1= new JpgReader();
                    break;
                case PNG:
                    reader1= new PngReader();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Неизвестный тип картинки");
        }

        return reader1;}
        else {throw new IllegalArgumentException();}
    }
}


