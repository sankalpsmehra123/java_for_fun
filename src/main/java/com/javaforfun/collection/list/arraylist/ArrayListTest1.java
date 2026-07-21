package com.javaforfun.collection.list.arraylist;

import java.util.ArrayList;



public class ArrayListTest1 {
    public static void main(String[] args) {
        // from java version 1.5 due to autoboxing
        ArrayList<Object> listWithAutoBoxing = new ArrayList<>();
        listWithAutoBoxing.add("Hello");
        listWithAutoBoxing.add("World");
        listWithAutoBoxing.add("Java");
        listWithAutoBoxing.add(10);
        listWithAutoBoxing.add(null);
        System.out.println(listWithAutoBoxing);

        // upto java version 1.4 without autoboxing
        ArrayList<Object> listWithoutAutoBoxing = new ArrayList<>();
        listWithoutAutoBoxing.add("Hello");
        listWithoutAutoBoxing.add(Integer.valueOf(10));  // type casting
        listWithoutAutoBoxing.add(null);
        listWithoutAutoBoxing.add(Character.valueOf('A')); // type casting
        listWithoutAutoBoxing.add(Boolean.valueOf(true)); // type casting
        listWithoutAutoBoxing.add(Byte.valueOf((byte) 1)); // type casting
        listWithoutAutoBoxing.add(Short.valueOf((short) 1)); // type casting
        System.out.println(listWithoutAutoBoxing); // automatically calls toString method of list
    }
}