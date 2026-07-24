package com.javaforfun.collection.set.hashset.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        // LinkedHashSet is backed by a hash table + a doubly-linked list running through
        // all entries, so it keeps insertion order - unlike plain HashSet.
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Orange");
        linkedSet.add("Grapes");
        linkedSet.add("Mango");
        System.out.println("LinkedHashSet: " + linkedSet);

        // Duplicates are still ignored, just like HashSet
        linkedSet.add("Apple");
        System.out.println("After re-adding 'Apple' (no change): " + linkedSet);

        // HashSet vs LinkedHashSet - same elements, different iteration order
        HashSet<String> hashSet = new HashSet<>(linkedSet);
        System.out.println("HashSet (order not preserved): " + hashSet);
        System.out.println("LinkedHashSet (insertion order preserved): " + linkedSet);

        // addFirst() / addLast() - part of the SequencedCollection API (Java 21+)
        linkedSet.addFirst("Pineapple");
        linkedSet.addLast("Strawberry");
        System.out.println("After addFirst(Pineapple) and addLast(Strawberry): " + linkedSet);

        // getFirst() / getLast()
        System.out.println("First element: " + linkedSet.getFirst());
        System.out.println("Last element: " + linkedSet.getLast());

        // removeFirst() / removeLast()
        String removedFirst = linkedSet.removeFirst();
        String removedLast = linkedSet.removeLast();
        System.out.println("Removed first: " + removedFirst + ", removed last: " + removedLast);
        System.out.println("LinkedHashSet now: " + linkedSet);

        // reversed() - returns a reverse-ordered view, backed by the same set
        SequencedSet<String> reversed = linkedSet.reversed();
        System.out.println("Reversed view: " + reversed);
    }
}
