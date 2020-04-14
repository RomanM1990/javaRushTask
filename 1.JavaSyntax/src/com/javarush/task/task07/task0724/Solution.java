package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human name0 = new Human("Павел",true,40);
        Human name00 = new Human("Катя",false,40);
        Human name01 = new Human("аваы",true,40);
        Human name02 = new Human("ттт",false,40);

        Human name1 = new Human("Аня",true,21, name0,name00);// напишите тут ваш код
        Human name2 = new Human("Аня",false,21, name01,name02);// напишите тут ваш код
        Human name3 = new Human("Аня",false,21, name0,name00);// напишите тут ваш код
        Human name4 = new Human("Аня",false,21, name1,name2);// напишите тут ваш код
        Human name5 = new Human("Аня",false,21, name1,name2);
        System.out.println(name0);// напишите тут ваш код
        System.out.println(name00);// напишите тут ваш код
        System.out.println(name01);// напишите тут ваш код
        System.out.println(name02);// напишите тут ваш код
        System.out.println(name1);// напишите тут ваш код
        System.out.println(name2);// напишите тут ваш код
        System.out.println(name3);// напишите тут ваш код
        System.out.println(name4);// напишите тут ваш код
        System.out.println(name5);// напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this(name,sex,age);
            this.father=father;
            this.mother=mother;
        }// напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}