package com;

import java.util.ArrayList;

public class Sorter {
    public ArrayList<String> bubbleSort(ArrayList<String> lst) {
        for (int i = 0; i < lst.size(); i++) {
            // index j is always i + 1. j iteration becomes shorter because sorted elements build up at end of list. \
            // no point in checking already sorted elements
            for (int j = 1; j < (lst.size() - i); j++) {
                if (lst.get(j-1).compareTo(lst.get(j)) > 0) {
                    //temp var for swap
                    String temp = lst.get(j - 1);
                    lst.set(j - 1, lst.get(j));
                    lst.set(j,temp);
                }
            }
        }
    return lst;
    }
}

