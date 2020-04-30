package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution {
    //добавьте классы Goose и Dragon тут

    public static void main(String[] args) {

        System.out.println(new Goose().getSize());

    }
    public static class Goose extends SmallAnimal{
        public String getSize(){
            return String.format("Гусь маленький, %s",super.getSize());
        }
    }
    public static class Dragon extends BigAnimal{
        public String getSize(){
            return String.format("Дракон большой, %s",super.getSize());
        }
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
