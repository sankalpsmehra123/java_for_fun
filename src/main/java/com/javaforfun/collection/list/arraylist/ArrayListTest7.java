package com.javaforfun.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest7 {
    public static void main(String[] args) {

        ArrayList<String> arrLst2 = new ArrayList<String>();
        arrLst2.add("pune");
        arrLst2.add("kolkata");
        arrLst2.add("san");
        arrLst2.add("kal");
        arrLst2.add("p");
        System.out.println("Before swapping => " + arrLst2);
        // swapping
        Collections.swap(arrLst2, 1, 3);
        System.out.println("After swapping => " + arrLst2);

        // sublist
        ArrayList<String> arrayList = new ArrayList<String>(arrLst2.subList(1, 3));
        System.out.println("Sublist => " + arrayList);
    }
}