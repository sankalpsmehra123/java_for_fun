package com.javaforfun.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListTest1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Sankalp");
        ll.addLast("Code");
        ll.removeFirst();
        System.out.println("linked List" + ll.toString());
    }

}
