package com.javaforfun.collection.cursors;
import java.util.ArrayList;
import java.util.Iterator;

public class CursorsIterator {
    public static void main(String[] args) {

        ArrayList<String> arrList1 = new ArrayList<String>();
        arrList1.add("pune");
        arrList1.add("kolkata");
        arrList1.add("san");
        arrList1.add("kal");
        arrList1.add("p");

        // read using itterator normal version commented because of warning
        // Iterator itt = arrList1.iterator();
        // while (itt.hasNext()) {
        //     String str = (String) itt.next();
        //     System.out.println(str);
        // }

        // read using itterator generic version
        Iterator<String> itt2 = arrList1.iterator();
        while (itt2.hasNext()) {
            System.out.println(itt2.next());
        }

        // read using itterator generic version
        Iterator<String> itt3 = arrList1.iterator();
        while (itt3.hasNext()) {
            System.out.println(itt3.next()); 
            itt3.remove();// can only be called after next() is called once
            System.out.println(arrList1);
        }
    }
}