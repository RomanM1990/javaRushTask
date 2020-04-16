package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String name = null;
        if (o instanceof Cat) name="Кот";
        else if (o instanceof Tiger) name="Тигр";//напишите тут ваш код
        else if (o instanceof Lion) name="Лев";//напишите тут ваш код
        else if (o instanceof Bull) name="Бык";//напишите тут ваш код
        else if (o instanceof Pig) name="Животное";
        else name="Животное";//напишите тут ваш код

        return name;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
