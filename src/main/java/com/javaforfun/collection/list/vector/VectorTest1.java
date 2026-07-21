package com.javaforfun.collection.list.vector;

import java.util.Vector;

public class VectorTest1 {
    public static void main(String[] args) {
        Vector<String> vec1 = new Vector<String>();
        vec1.add("pune");
        vec1.add("kolkata");
        vec1.add("san");
        vec1.add("kal");
        vec1.add("p");

        System.out.println(vec1);
        System.out.println(vec1.capacity());

        Vector<String> vec2 = new Vector<String>(2);
        vec2.add("pune");
        vec2.add("kolkata");

        System.out.println(vec2);
        System.out.println(vec2.capacity());

        vec2.add("san");

        System.out.println(vec2);
        System.out.println(vec2.capacity());

        Vector<String> vec3 = new Vector<String>(2, 1);
        vec3.add("pune");
        vec3.add("kolkata");

        System.out.println(vec3);
        System.out.println(vec3.capacity());

        vec3.add("san");

        System.out.println(vec3);
        System.out.println(vec3.capacity());
    }
}
