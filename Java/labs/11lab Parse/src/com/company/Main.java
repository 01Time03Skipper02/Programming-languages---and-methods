package com.company;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static Scanner scanner = new Scanner(new InputStreamReader(System.in));
    public static String[] res = new String[0];
    public static String[] parseSentence(String sentence){
        int cntQuotation = 0;
        int cntBracket = 0;

        for(int i = 0; i < sentence.length(); i++){
            String subSentence = String.valueOf('"');
            String subSentence2 = String.valueOf(' ');
            if (sentence.charAt(i) == ' '){
                /*res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = String.valueOf(sentence.charAt(i));*/
                continue;
            }
            if (sentence.charAt(i) != '"' && sentence.charAt(i) != '(' && sentence.charAt(i) != ')'){
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = String.valueOf(sentence.charAt(i));
            }
            if (cntQuotation == 1){
                subSentence += sentence.charAt(i);
            }
            if (sentence.charAt(i) == '"' && cntQuotation == 0){
                cntQuotation++;
            }
            if (sentence.charAt(i) == '"' && cntQuotation == 1){
                res = Arrays.copyOf(res, res.length+1);
                res[res.length-1] = subSentence;
                subSentence = String.valueOf('"');
                cntQuotation--;
            }
            if (cntBracket == 1 && sentence.charAt(i) != ')'){
                subSentence2 += sentence.charAt(i);
            }
            if (sentence.charAt(i) == '(' && cntBracket == 0){
                res = Arrays.copyOf(res, res.length+2);
                res[res.length-2] = " ";
                res[res.length-1] = "(";
                cntBracket++;
            }
            if (sentence.charAt(i) == ')' && cntBracket == 1){
                parseSentence(subSentence2);
                res = Arrays.copyOf(res, res.length+2);
                res[res.length-2] = ")";
                res[res.length-1] = " ";
                subSentence2 = String.valueOf(' ');
                cntBracket--;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        String sentence = scanner.nextLine();
        String[] result = parseSentence(sentence);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
        }
    }
}
