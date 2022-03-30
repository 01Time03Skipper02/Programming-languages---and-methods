package com.company;

public class iterString implements Iterable{

    private static String str;

    public iterString(String str) {
        this.str = str;
    }

    public strIterator iterator() {
        return new strIterator();
    }

    private static class strIterator implements java.util.Iterator{
        int index = 0;

        public boolean hasNext() {
            return index < str.length();
        }

        public Character next() {
            return str.charAt(index++);
        }
    }

    public String toString() {
        return "iterString{" + "str='" + str + '\'' + '}';
    }
}
