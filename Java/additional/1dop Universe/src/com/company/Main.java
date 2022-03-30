package com.company;

import static java.lang.Math.*;

public class Main {
    public static double getAverageRvec(Point universe[], int n){
        double cntVec = 0;
        for (int i = 0; i < n; i++){
            double rvec = sqrt((universe[i].getX()) * (universe[i].getX()) + (universe[i].getY()) * (universe[i].getY()));
            cntVec += rvec;
        }
        return cntVec/n;
    }
    public static void main(String[] args) {
        Point universe[] = new Point[100];
        for (int i = 0; i < 100; i++){
            double x = round(random() * 100);
            double y = round(random() * 100);
            universe[i] = new Point((int) x, (int)y);
        }
        double averageVec = getAverageRvec(universe, 100);
        double V = PI * pow(averageVec, 3) * 4 / 3;
        System.out.println(V);
    }
}
