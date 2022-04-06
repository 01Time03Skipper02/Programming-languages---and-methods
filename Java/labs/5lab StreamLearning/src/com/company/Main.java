package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array size: ");
        int n = scanner.nextInt();
        System.out.print("Input power: ");
        int k = scanner.nextInt();
        ArrayList<Integer> test = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int buf = scanner.nextInt();
            test.add(buf);
        }
        intStream a = new intStream(test, k);
        System.out.println("Random deviders of numbers from Stream powered k: ");
        a.stream().forEach(System.out::println);
        System.out.print("Minimal number from Array: ");
        System.out.println(a.optional().get());
    }
}
