package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Matrix implements Comparable <Matrix>{
    private int m;
    private int n;
    private double[][] matrix;
    private int rang;
    public Matrix(int m, int n, double[][] matrix, int rang){
        this.m = m;
        this.n = n;
        this.matrix = matrix;
        this.rang = rang;
    }
    public double[][] getMatrix(){
        return this.matrix;
    }
    public double getRang(){
        return this.rang;
    }
    public void putRang(int rang){
        this.rang = rang;
    }
    public void putMatrix(double[][] matrix){
        this.matrix = matrix;
    }
    public int compareTo(Matrix obj) {
        if (getRang() < obj.getRang()) return -1;
        if (getRang()  ==  obj.getRang()) return 0;
        return 1;
    }
    public String toString(){
        ArrayList<Integer> buf = new ArrayList<Integer>();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                buf.add((int)matrix[i][j]);
            }
        }
        return "Matrix size is: " + m + " x " + n + ", Matrix's elements are: " + buf + ", Matrix rank is: " + rang;
    }
}
