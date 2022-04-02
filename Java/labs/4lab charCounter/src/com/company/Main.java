package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        // input str
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //put str in our test class
        iterString test = new iterString(str);

        //put iterator of test class for our comfortable
        Iterator iterator = test.iterator();

        //make hash table and initialize it with 0
        HashMap<Character, Integer> res = new HashMap<>();
        for(char i = 'a'; i <= 'z'; i++){
            res.put(i, 0);
        }

        //iterate our str and count letters
        while(iterator.hasNext()){
            char a = (char)iterator.next();
            int buf = res.get(a);
            buf += 1;
            res.put(a, buf);
        }

        /*
        without iteration
        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            int buf = res.get(a);
            buf += 1;
            res.put(a, buf);
        }*/

        System.out.println(res);
    }
}
