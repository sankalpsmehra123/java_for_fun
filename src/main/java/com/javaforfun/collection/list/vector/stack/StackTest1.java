package com.javaforfun.collection.list.vector.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("String");
        stack.push("bull run");
        stack.push("");
        stack.pop();

        Queue<String> queue = new LinkedList<String>();
        queue.add("first");
        queue.add("bull run");
        queue.add("last");
        queue.poll();
        System.out.println(queue.toString());
    }
}
