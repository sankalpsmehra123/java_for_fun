package com.javaforfun.collection.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class CursorsEnumerator {
    public static void main(String[] args) {
        Vector<String> vec1 = new Vector<String>();
        vec1.add("pune");
        vec1.add("kolkata");
        vec1.add("san");
        vec1.add("kal");
        vec1.add("p");
        // read using enumerator normal version commented because of warning
        // Enumeration enn = vec1.elements();
        // while (enn.hasMoreElements()) {
        // String str = (String) enn.nextElement();
        // System.out.println(str);
        // }

        // read using enumerator generic version
        Enumeration<String> enn1 = vec1.elements();
        while (enn1.hasMoreElements()) {
            System.out.println(enn1.nextElement());
        }
    }
}