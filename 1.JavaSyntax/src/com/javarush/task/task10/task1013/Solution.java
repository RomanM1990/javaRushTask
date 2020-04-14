package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String name;
        private char sex;
        private int weight;
        private  String profession;
        private int height;

        public Human(int age){
            this.age=age;
        }
        public Human(int age,String name){
            this(age);
            this.name=name;
        }

        public Human(int age, String name, char sex){
            this(age, name);
            this.sex=sex;
        }
        public Human(int age, String name, char sex, int weight){
            this(age, name, sex);
            this.weight=weight;
        }
        public Human(int age, String name, char sex, int weight, String profession){
            this(age, name, sex, weight);
            this.profession=profession;
        }
        public Human(int age, String name, char sex, int weight, String profession, int height){
            this(age, name, sex, weight, profession);
            this.height=height;
        }
        public Human(int age, String name, char sex, int weight, int height){
            this(age, name, sex, weight);
            this.height=height;
        }
        public Human(int age, String name, char sex,  String profession, int height){
            this(age, name, sex);
            this.profession=profession;
            this.height=height;
        }
        public Human(int age, String name, int weight, String profession, int height) {
            this(age, name);
            this.weight = weight;
            this.profession = profession;
            this.height = height;
        }
        public Human(int age, char sex, int weight, String profession, int height){
            this(age);
            this.sex=sex;
            this.weight = weight;
            this.profession = profession;
            this.height = height;
        }// Напишите тут ваши переменные и конструкторы
    }
}
