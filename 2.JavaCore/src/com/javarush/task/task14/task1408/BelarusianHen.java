package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 0;
    }
    String getDescription(){
        return  String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(), Country.BELARUS, getCountOfEggsPerMonth());
    }
}
