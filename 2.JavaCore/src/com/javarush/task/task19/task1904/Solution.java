package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner=fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String[] array = fileScanner.nextLine().split(" ", 4);
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            String lastName = array[0];
            String firstName = array[1];
            String middleName = array[2];
            Date date = format.parse(array[3]);

            return new Person(firstName,middleName,lastName,date);

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
