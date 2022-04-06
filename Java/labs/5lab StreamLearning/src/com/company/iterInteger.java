package com.company;

import java.util.Iterator;

public class iterInteger implements Iterable{
    private int x;

    public iterInteger(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public Iterator iterator() {
        return new Iterator() {
            public boolean hasNext() {
                return x > 0;
            }

            public Object next() {
                return x--;
            }
        };
    }

    public String toString() {
        return "iterInteger{" + "x=" + x + '}';}
}
