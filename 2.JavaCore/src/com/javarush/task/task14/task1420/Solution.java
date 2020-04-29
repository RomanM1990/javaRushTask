package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int q=Integer.parseInt(reader.readLine());
        int qe=Integer.parseInt(reader.readLine());
        if (q<=0 || qe<=0) throw new Exception();
        int s=Math.min(q,qe);
        while(!((q%s==0)&&(qe%s==0))){
            s--;
        }
        System.out.println(s);

    }
}
