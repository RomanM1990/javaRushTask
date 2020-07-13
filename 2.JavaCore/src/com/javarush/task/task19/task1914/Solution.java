package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream=System.out;
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        PrintStream stream=new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        String result=outputStream.toString();
        String[] string = result.split(" ");
        int x;
        switch (string[1]) {
            case "+":
                x = Integer.parseInt(string[0]) + Integer.parseInt(string[2]);
                break;
            case "-":
                x = Integer.parseInt(string[0]) - Integer.parseInt(string[2]);
                break;
            case "*":
                x = Integer.parseInt(string[0]) * Integer.parseInt(string[2]);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + string[1]);
        }
        System.out.println(result+" "+x);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

