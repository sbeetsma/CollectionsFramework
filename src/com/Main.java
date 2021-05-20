package com;

public class Main {
    public static void main(String[] args){
        RandomList lst = new RandomList(5, 4);
        System.out.println(lst.getLst());
        System.out.println(new Sorter().bubbleSort(lst.getLst()));
    }
}
