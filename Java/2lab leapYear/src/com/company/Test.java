package com.company;

public class Test {
    private int year;
    private String leap;
    public Test(int year){
        this.year = year;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leap = "год високосный";
                } else {
                    leap = "год не високосный";
                }
            } else {
                leap = "год високосный";
            }
        } else {
            leap = "год не високосный";
        }
    }
    public String getLeap(){
        return leap;
    }
    public String toString(){
        return year + " " + leap;
    }
}
