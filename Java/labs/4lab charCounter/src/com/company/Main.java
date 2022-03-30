package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        //считываем строку
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //кладём в переменную test итерируемую строку
        iterString test = new iterString(str);

        //кладём в iterator, собственно, итератор нашей строки
        Iterator iterator = test.iterator();

        //создаем хэш-таблицу с ключами a...z и заполняем ее нулями
        HashMap<Character, Integer> res = new HashMap<>();
        for(char i = 'a'; i <= 'z'; i++){
            res.put(i, 0);
        }

        //итерируем нашу строку и считаем буквы
        while(iterator.hasNext()){
            char a = (char)iterator.next();
            int buf = res.get(a);
            buf += 1;
            res.put(a, buf);
        }

        /*
        Решение без итерирования
        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            int buf = res.get(a);
            buf += 1;
            res.put(a, buf);
        }*/

        System.out.println(res);
    }
}
