package com.javarush.task.task08.task0819;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        for (Cat cat : cats) {
            cats.remove(cat);
            break;
        }//напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();
        Set<Cat> cat=new HashSet<Cat>();
        cat.add(cat1);
        cat.add(cat2);
        cat.add(cat3);

        //напишите тут ваш код. step 2 - пункт 2
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat text : cats) System.out.println(text);// step 4 - пункт 4
    }

    public static class Cat{

    }// step 1 - пункт 1
}
