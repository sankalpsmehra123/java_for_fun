package com.javaforfun.collection.list.arraylist;

import java.util.ArrayList;

import com.javaforfun.model.Employee;

public class ArrayListTest3 {
    public static void main(String[] args) {
        // from java version 1.5 due to autoboxing
        ArrayList<Employee> typeSafeArrayList = new ArrayList<Employee>(); // type safety with generics
        typeSafeArrayList.add(new Employee().setEmployeeId(1).setName("John"));
        // typeSafeArrayList.add(new Student().setName("Ram").setStudentId(1)); // error due to type safe arraylist
        System.out.println("listWithAutoBoxing: " + typeSafeArrayList);

        for (Object obj : typeSafeArrayList) {
            if (obj instanceof Employee) { // type checking
                System.out.println(obj);
            }
        }
    }
}