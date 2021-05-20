package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main <E extends Comparable<E>>{
    public static void main(String[] args){
        RandomList lst = new RandomList(10, 1);
        ArrayList<Integer> listIntegers = new ArrayList<>(Arrays.asList(3, 2, 6 , 1, 2, 7, 9, 10, 32, 1));
        System.out.println(listIntegers);
        System.out.println(lst.getLst());
        System.out.println(new Sorter().bubbleSort(lst.getLst()));
        System.out.println(new Sorter().bubbleSort(listIntegers));

        ArrayList list = new ArrayList();
        HashMap mMap = new HashMap();

        mMap.put("Voornaam", "Sjoerd");
        mMap.put("Achternaam","Beetsma");
        mMap.put("Leeftijd",21);
        list.add(mMap.clone());
        mMap.clear();

        mMap.put("Voornaam", "Albert");
        mMap.put("Achternaam","Jansen");
        mMap.put("Leeftijd", 19);
        list.add(mMap.clone());
        mMap.clear();

        mMap.put("Voornaam", "Abc");
        mMap.put("Achternaam","Zyx");
        mMap.put("Leeftijd",99);
        list.add(mMap.clone());
        mMap.clear();

        System.out.println(new Sorter().bubbleSortMaps(list, "Voornaam", 1));
        System.out.println(new Sorter().bubbleSortMaps(list, "Achternaam", 1));
        System.out.println(new Sorter().bubbleSortMaps(list, "Leeftijd", 1));
    }
}
