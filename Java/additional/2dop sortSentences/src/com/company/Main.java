package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static int maxlen(String[] sentence){
        int max = 0;
        for (int i = 0; i < sentence.length; i++){
            int len = sentence[i].length();
            if(len>max){
                max = len;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int n = in.nextInt();
        Sentence[] array = new Sentence[n];
        for (int i = 0; i < n; i++){
            String a = in.nextLine();
            String[] words = a.split("\\s");
            array[i] = new Sentence(a, 0, words);
        }
        for (int i = 0; i < n; i++){
            String[] buf = array[i].getWords();
            int max = maxlen(buf);
            array[i].putMaxlength(max);
        }
        Arrays.sort(array);
        for(int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
        in.close();
    }
}
