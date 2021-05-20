package com;

import java.util.ArrayList;
import java.util.Random;

public class RandomList {
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private ArrayList<String> lst = new ArrayList<>();

    public RandomList(int lenList, int lenString) {
        Generate(lenList, lenString);
    }

    public ArrayList<String> getLst() {
        return lst;
    }

    public void Generate(int lenList, int lenString){
        for(int i=0;i<lenList;i++){
            StringBuilder word = new StringBuilder();
            for(int j=0;j<lenString;j++){
                int index = new Random().nextInt(this.alphabet.length());
                word.append(this.alphabet.charAt(index));
            }
            lst.add(word.toString());
        }

    }
}
