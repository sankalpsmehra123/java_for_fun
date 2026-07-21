package com.javaforfun.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest6 {
    public static void main(String[] args) {
        // conversion of arrays to collections 

        String[] stringArr = {"san","kal","p"};
        ArrayList<String> arrLst = new ArrayList<String>(Arrays.asList(stringArr));
        arrLst.add("pune");
        arrLst.add("kolkata");
        System.out.println(arrLst);

        // conversion of arrays to collections with generics
        ArrayList<String> arrLst2 = new ArrayList<String>();
        arrLst2.add("pune");
        arrLst2.add("kolkata");
        arrLst2.add("san");
        arrLst2.add("kal");
        arrLst2.add("p");
        String[] stringArr2 = new String[arrLst2.size()];
        stringArr2 = arrLst2.toArray(stringArr2);
        System.out.println(Arrays.toString(stringArr2));

        // conversion of arrays to collections without generics - Commented because of warning
        // ArrayList arrLst3 = new ArrayList();
        // arrLst3.add("pune");
        // arrLst3.add("kolkata");
        // arrLst3.add("san");
        // arrLst3.add("kal");
        // arrLst3.add(10);
        // Object[] object2 = arrLst3.toArray();
        // for (Object o: object2) {
        //     System.out.println(o);
        // }

    }
}