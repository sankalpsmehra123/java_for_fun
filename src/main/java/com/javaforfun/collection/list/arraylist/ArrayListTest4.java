package com.javaforfun.collection.list.arraylist;

import java.util.ArrayList;

import com.javaforfun.model.Student;

public class ArrayListTest4 {
    public static void main(String[] args) {
        // from java version 1.5 due to autoboxing
        ArrayList<Student> typeSafeArrayList = new ArrayList<>(); // type safety with generics
        typeSafeArrayList.add(new Student().setName("Sai").setStudentId(0));
        typeSafeArrayList.add(new Student().setName("Ram").setStudentId(1));
        System.out.println("listWithAutoBoxing ==> " + typeSafeArrayList);
        System.out.println("listWithAutoBoxing size ==> " + typeSafeArrayList.size());
        typeSafeArrayList.add(1, new Student().setName("Sham").setStudentId(2));
        System.out.println("after adding at second position with index ==> " + typeSafeArrayList);
        typeSafeArrayList.add(new Student().setName("Sita").setStudentId(3));
        System.out.println("after adding at without index ==> " + typeSafeArrayList);
        typeSafeArrayList.remove(1);
        System.out.println("after removing at second position by index ==> " + typeSafeArrayList);
        typeSafeArrayList.remove(typeSafeArrayList.get(0));
        System.out.println("after removing at first data ==> " + typeSafeArrayList);
        typeSafeArrayList.set(0, new Student().setName("Sita2").setStudentId(4));
        System.out.println("after setting at first data ==> " + typeSafeArrayList);
        System.out.println("is empty ==> " + typeSafeArrayList.isEmpty());
        typeSafeArrayList.clear();
        System.out.println("is empty ==> " + typeSafeArrayList.isEmpty());
        typeSafeArrayList.remove(1); // index out of bounds exceptions



    }
}