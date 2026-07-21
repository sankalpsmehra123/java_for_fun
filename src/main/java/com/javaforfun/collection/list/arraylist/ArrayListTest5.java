package com.javaforfun.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListTest5 {
    public static void main(String[] args) {
        // from java version 1.5 due to autoboxing
        ArrayList<Integer> typeSafeArrayList = new ArrayList<>(); // type safety with generics
        typeSafeArrayList.add(0);
        typeSafeArrayList.add(1);
        System.out.println("listWithAutoBoxing ==> " + typeSafeArrayList);

        ArrayList<Integer> typeSafeArrayList2 = new ArrayList<>(typeSafeArrayList); // type safety with generics
        typeSafeArrayList2.add(3);
        typeSafeArrayList2.add(4);
        System.out.println("listWithAutoBoxing ==> " + typeSafeArrayList2);

        ArrayList<Integer> typeSafeArrayList3 = new ArrayList<>(); // type safety with generics
        typeSafeArrayList3.addAll(typeSafeArrayList2); // method to add one collection to another collection in java collections. Can be used to add one collection to another
        typeSafeArrayList3.add(5);
        typeSafeArrayList3.add(6);
        System.out.println("listWithAutoBoxing ==> " + typeSafeArrayList3);

    }
}