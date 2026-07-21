package com.javaforfun.collection.list.arraylist;

import java.util.ArrayList;

import com.javaforfun.model.Employee;
import com.javaforfun.model.Student;

public class ArrayListTest2 {
    public static void main(String[] args) {
        // from java version 1.5 due to autoboxing
        ArrayList<Object> listWithAutoBoxing = new ArrayList<>();
        listWithAutoBoxing.add(new Employee().setEmployeeId(1).setName("John"));
        listWithAutoBoxing.add(new Student().setName("Ram").setStudentId(1));
        System.out.println("listWithAutoBoxing: " + listWithAutoBoxing);

        for (Object obj : listWithAutoBoxing) {
            if (obj instanceof Employee) { // type checking
                System.out.println(obj);
            }
        }
    }
}