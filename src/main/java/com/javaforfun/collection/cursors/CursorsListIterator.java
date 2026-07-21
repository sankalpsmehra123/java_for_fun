package com.javaforfun.collection.cursors;
import java.util.ArrayList;
import java.util.ListIterator;

public class CursorsListIterator {
    public static void main(String[] args) {

        ArrayList<String> arrList1 = new ArrayList<String>();
        arrList1.add("pune");
        arrList1.add("kolkata");
        arrList1.add("san");
        arrList1.add("kal");
        arrList1.add("p");

        // read using list itterator normal version commented because of warning
        // ListIterator listItt = arrList1.listIterator();
        // while (listItt.hasNext()) {
        //     String str = (String) listItt.next();
        //     System.out.println(str);
        // }

        // read using list itterator generic version forward cursor should move forward to read it backwards later
        ListIterator<String> listItt2 = arrList1.listIterator();
        while (listItt2.hasNext()) {
            System.out.println(listItt2.next());
        }

        // read using list itterator generic version backward and using set method
        while (listItt2.hasPrevious()) {
            System.out.println(listItt2.previous());
            listItt2.set("10");// can only be called after next() is called once
            System.out.println(arrList1);
        }

        // read using list itterator generic version forward and using add method
        while (listItt2.hasNext()) {
            System.out.println(listItt2.next()); 
            listItt2.add("padd");// can only be called after next() is called once
            System.out.println(arrList1);
        }

        // read using list itterator generic version backward and using remove method
        while (listItt2.hasPrevious()) {
            System.out.println(listItt2.previous());
            listItt2.set("10");// can only be called after next() is called once
            System.out.println(arrList1);
        }
    }
}