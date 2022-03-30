package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static int R = in.nextInt();
    public static int C = in.nextInt();

    public static void swap(double mat[][], int row1, int row2, int col) {
        for (int i = 0; i < col; i++) {
            double temp = mat[row1][i];
            mat[row1][i] = mat[row2][i];
            mat[row2][i] = temp;
        }
    }
    /* public static BigInteger determinant(final double[][] matr) {

        int n = matr.length;
        BigInteger[][] a = new BigInteger[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0;j  < n; ++j) {
                a[i][j] = BigInteger.valueOf((long) matr[i][j]);
            }
        }

        BigInteger prime = BigInteger.probablePrime(n + 4, new Random());

        BigInteger det = BigInteger.ONE;

        for (int row = 0; row < n; ++row) {
            int currentRow = row;
            while (currentRow < n && a[currentRow][row].equals(BigInteger.ZERO)) {
                ++currentRow;
            }
            if (currentRow == n) {
                return BigInteger.ZERO;
            }

            if (currentRow != row) {
                det = det.negate();
                BigInteger[] tmp = a[currentRow];
                a[currentRow] = a[row];
                a[row] = tmp;
            }

            BigInteger inverse = a[row][row].modInverse(prime);

            for (currentRow = row + 1; currentRow < n; ++currentRow) {
                if (a[currentRow][row].equals(BigInteger.ZERO)) {
                    continue;
                }
                BigInteger coefficient = a[currentRow][row].multiply(inverse).remainder(prime);
                for (int column = row; column < n; ++column) {
                    a[currentRow][column] = a[currentRow][column].subtract(a[row][column].multiply(coefficient).remainder(prime)).remainder(prime);
                }
            }

        }

        for (int i = 0; i < n; ++i) {
            det = det.multiply(a[i][i]).remainder(prime);
        }
        det = det.add(prime);
        det = det.remainder(prime);
        if (det.multiply(BigInteger.valueOf(2)).compareTo(prime) > 0) {
            det = prime.subtract(det).remainder(prime);
        }
        return det;
    } */

    public static int rankOfMatrix(double mat[][]) {
        int rank = C;
        for (int row = 0; row < rank; row++) {
            if (mat[row][row] != 0) {
                for (int col = 0; col < R; col++) {
                    if (col != row) {
                        double mult = (double)mat[col][row] / mat[row][row];
                        for (int i = 0; i < rank; i++) mat[col][i] -= mult * mat[row][i];
                    }
                }
            } else {
                boolean reduce = true;
                for (int i = row + 1; i < R; i++) {
                    if (mat[i][row] != 0) {
                        swap(mat, row, i, rank);
                        reduce = false;
                        break ;
                    }
                }
                if (reduce) {
                    rank--;
                    for (int i = 0; i < R; i ++)
                        mat[i][row] = mat[i][rank];
                }
                row--;
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        int nmatr = in.nextInt();
        Matrix[] array = new Matrix[nmatr];
        int m = R;
        int n = C;
        for (int i = 0; i < nmatr; i++){
            double[][] matrix = new double[m][n];
            double[][] buf = new double[m][n];
            for (int a = 0; a < m; a++){
                for (int b = 0; b < n; b++){
                    matrix[a][b] = in.nextDouble();
                    buf[a][b] = matrix[a][b];
                }
            }
            array[i] = new Matrix(m, n, matrix, 0);
            array[i].putRang(rankOfMatrix(array[i].getMatrix()));
            array[i].putMatrix(buf);
            //System.out.println(array[i]);
        }
        /*for (int i = 0; i < 2; i++){
            BigInteger res = determinant(array[i].getMatrix());
            System.out.println(res);
        }*/
        Arrays.sort(array);
        for (int i = 0; i < nmatr; i++){
            System.out.println(array[i]);
        }
        in.close();
    }
}
