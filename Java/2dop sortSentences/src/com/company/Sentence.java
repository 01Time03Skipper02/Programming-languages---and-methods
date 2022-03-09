package com.company;

public class Sentence implements Comparable <Sentence>{
    private String sentence;
    private int maxlength;
    private String[] words;
    public Sentence(String sentence, int maxlength, String[] words){
        this.sentence = sentence;
        this.maxlength = maxlength;
        this.words = words;
    }

    public int getMaxlength(){
        return this.maxlength;
    }
    public String[] getWords(){
        return this.words;
    }
    public void putMaxlength(int maxlength){
        this.maxlength = maxlength;
    }
    public int compareTo(Sentence obj) {
        if (getMaxlength() < obj.getMaxlength()) return -1;
        if (getMaxlength()  ==  obj.getMaxlength()) return 0;
        return 1;
    }

    public String toString(){
        return "It's sentence: " + sentence + "\nIt's max length of word: " + maxlength;
    }
}
