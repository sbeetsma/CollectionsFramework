package com;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main <E extends Comparable<E>>{
    public static void main(String[] args){
        Sorter sorter = new Sorter();
        RandomList lst = new RandomList(10, 1);
        ArrayList<Integer> listIntegers = new ArrayList<>(Arrays.asList(3, 2, 6 , 1, 2, 7, 9, 10, 32, 1));
        // sort list of random strings
        System.out.println("voor sorteren: " + lst.getLst());
        System.out.println("na sorteren: " + sorter.bubbleSort(lst.getLst(), 1) + "\n");

        // sort list of integers
        System.out.println("voor sorteren: " + listIntegers);
        System.out.println(("na sorteren: " + sorter.bubbleSort(listIntegers, 1) + "\n"));

        // simple student object gets ordered by average grade
        Student student_1 = new Student("Piet");
        student_1.addGrades(new ArrayList<>(Arrays.asList(9,9,8)));
        Student student_2 = new Student("Jan");
        student_2.addGrades(new ArrayList<>(Arrays.asList(3,8,7)));
        Student student_3 = new Student("Klaas");
        student_3.addGrades(new ArrayList<>(Arrays.asList(8,6,7)));
        Student student_4 = new Student("Joep");
        student_4.addGrades(new ArrayList<>(Arrays.asList(10,10,9)));


        // order students
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student_1, student_2, student_3, student_4));
        System.out.println("voor sorteren: " + students);
        System.out.println("na sorteren: " +sorter.bubbleSort(students, -1) + "\n");

        // Make arraylist of hashmaps
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

        // sort by different keys of the map
        System.out.println("sorteren op Voornaam: "+sorter.bubbleSortMaps(list, "Voornaam", 1));
        System.out.println("sorteren op Achternaam: "+sorter.bubbleSortMaps(list, "Achternaam", 1));
        System.out.println("sorteren op leeftijd: "+sorter.bubbleSortMaps(list, "Leeftijd", 1));
        // reverse sort (high to low)
        System.out.println("sorteren op leeftijd(reversed): "+sorter.bubbleSortMaps(list, "Leeftijd", -1));



    }
}
