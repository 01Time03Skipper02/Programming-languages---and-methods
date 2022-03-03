package com.company;

public class Point {
    private double x;
    private double y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void putX(double x){
        this.x = x;
    }
    public void putY(double y){
        this.y = y;
    }

    public String toString(){
        return "coord: (" + this.x + ", " + this.y + ")";
    }
}
