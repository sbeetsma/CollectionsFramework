package com;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        RandomList lst = new RandomList(10, 1);
        ArrayList<Integer> listIntegers = new ArrayList<>(Arrays.asList(3, 2, 6 , 1, 2, 7, 9, 10, 32, 1));
        System.out.println(listIntegers);
        System.out.println(lst.getLst());
        System.out.println(new Sorter().bubbleSort(lst.getLst()));
        System.out.println(new Sorter().bubbleSort(listIntegers));
    }
}
