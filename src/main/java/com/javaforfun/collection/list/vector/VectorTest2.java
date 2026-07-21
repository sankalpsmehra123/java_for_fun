package com.javaforfun.collection.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest2 {
    public static void main(String[] args) {

        Vector<String> vec1 = new Vector<String>();
        vec1.add("pune");
        vec1.add("kolkata");
        vec1.add("san");
        vec1.add("kal");
        vec1.add("p");

        Enumeration<String> enn1 = vec1.elements();
        while (enn1.hasMoreElements()) {
            System.out.println(enn1.nextElement());
        }

        Iterator<String> itt2 = vec1.iterator();
        while (itt2.hasNext()) {
            System.out.println(itt2.next());
        }

        ListIterator<String> listItt3 = vec1.listIterator();
        while (listItt3.hasNext()) {
            System.out.println(listItt3.next());
        }
        
    }
}
