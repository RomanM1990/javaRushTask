package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String name = null;
        if (o instanceof Tiger) name="Тигр";//напишите тут ваш код
        else if (o instanceof Lion) name="Лев";
        else if (o instanceof Cat) name="Кот";//напишите тут ваш код
        else if (o instanceof Bull) name="Бык";//напишите тут ваш код
        else if (o instanceof Cow) name="Корова";//напишите тут ваш код
        else name="Животное";
        return name;//напишите тут ваш код


    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
