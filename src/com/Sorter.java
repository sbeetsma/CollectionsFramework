package com;

import java.util.ArrayList;
import java.util.HashMap;

public class Sorter <E extends Comparable<E>>  {
    public ArrayList<E> bubbleSort(ArrayList<E> lst) {
        for (int i = 0; i < lst.size(); i++) {
            // index j is always i + 1. j iteration becomes shorter because sorted elements build up at end of list. \
            // no point in checking already sorted elements
            for (int j = 1; j < (lst.size() - i); j++) {
                if (lst.get(j-1).compareTo(lst.get(j)) > 0) {
                    //temp var for swap
                    E temp = lst.get(j - 1);
                    lst.set(j - 1, lst.get(j));
                    lst.set(j,temp);
                }
            }
        }
    return lst;
    }
    // to change to different sorting algorithm for sorting maps
    public ArrayList<HashMap> bubbleSortMaps(ArrayList<HashMap> lst, String sortKey, int reverse) {

        for (int i = 0; i < lst.size(); i++) {
            for (int j = 1; j < (lst.size() - i); j++) {
                E cur = (E) lst.get(j-1).get(sortKey);
                E next = (E) lst.get(j).get(sortKey);
                if (cur.compareTo(next)*reverse > 0){
                    HashMap temp = lst.get(j - 1);
                    lst.set(j - 1, lst.get(j));
                    lst.set(j,temp);
                }
            }
        }return lst;

    }
}
