package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new nit1());
        threads.add(new nit2());
        threads.add(new nit3());
        threads.add(new nit4());
        threads.add(new nit5());
    }

    public static void main(String[] args) {
    }
    public static class nit1 extends Thread{
        public void run(){
            while (true);
        }
    }
    public static class nit2 extends Thread{
        public void run(){

            try {
                threads.get(1).join();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }

    }
    public static class nit3 extends Thread{
        public void run(){
            try {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class nit4 extends Thread implements Message{
        public void showWarning(){
            threads.get(3).interrupt();
        }
        public void run(){
            while(!interrupted()){}
        }

    }
    public static class nit5 extends Thread{
        public void run(){
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            int sum=0;
            while (true){
                try {
                    String name=reader.readLine();
                    if (name.equals("N")) {break;}
                    sum+=Integer.parseInt(name);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(String.valueOf(sum));
        }
    }
}
