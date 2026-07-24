package com.javaforfun.collection.set.sortedset.navigableset.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        // TreeSet() - backed by a balanced tree (TreeMap internally), elements are
        // sorted according to their natural ordering (String implements Comparable).
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Orange");
        set.add("Grapes");
        System.out.println("TreeSet (naturally sorted): " + set);

        // addAll()
        set.addAll(java.util.List.of("Kiwi", "Fig"));
        System.out.println("After addAll: " + set);

        // TreeSet does NOT allow null - throws NullPointerException when compared
        try {
            set.add(null);
        } catch (NullPointerException e) {
            System.out.println("Adding null threw NullPointerException as expected.");
        }

        // TreeSet(Comparator) - custom ordering, here sorted by descending length then alphabetically
        TreeSet<String> byLength = new TreeSet<>(
                Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        byLength.addAll(set);
        System.out.println("TreeSet sorted by length: " + byLength);
        System.out.println("Comparator in use: " + (byLength.comparator() != null));

        // first() / last() - lowest and highest elements
        System.out.println("First: " + set.first() + ", Last: " + set.last());

        // ceiling / floor / higher / lower - navigation relative to a given value
        System.out.println("ceiling('Lemon'): " + set.ceiling("Lemon")); // least element >= "Lemon"
        System.out.println("floor('Lemon'): " + set.floor("Lemon"));     // greatest element <= "Lemon"
        System.out.println("higher('Mango'): " + set.higher("Mango"));   // strictly greater than "Mango"
        System.out.println("lower('Mango'): " + set.lower("Mango"));     // strictly less than "Mango"

        // headSet / tailSet / subSet - range views backed by the original set
        SortedSet<String> head = set.headSet("Mango"); // elements strictly less than "Mango"
        System.out.println("headSet('Mango'): " + head);

        SortedSet<String> tail = set.tailSet("Mango"); // elements >= "Mango"
        System.out.println("tailSet('Mango'): " + tail);

        SortedSet<String> sub = set.subSet("Apple", "Mango"); // ["Apple", "Mango")
        System.out.println("subSet('Apple', 'Mango'): " + sub);

        // NavigableSet overloads with inclusive/exclusive control
        NavigableSet<String> headInclusive = set.headSet("Mango", true);
        System.out.println("headSet('Mango', inclusive=true): " + headInclusive);

        NavigableSet<String> subRange = set.subSet("Apple", true, "Mango", true);
        System.out.println("subSet('Apple' to 'Mango', both inclusive): " + subRange);

        // descendingSet() / descendingIterator() - reverse order view
        NavigableSet<String> descending = set.descendingSet();
        System.out.println("descendingSet(): " + descending);

        Iterator<String> descIterator = set.descendingIterator();
        System.out.print("descendingIterator(): ");
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " ");
        }
        System.out.println();

        // pollFirst() / pollLast() - retrieve and remove, unlike first()/last() which only peek
        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("pollLast(): " + set.pollLast());
        System.out.println("TreeSet after polling: " + set);

        // addFirst()/addLast() are inherited from SequencedCollection but TreeSet's
        // ordering is fixed by the comparator, so both throw UnsupportedOperationException
        try {
            set.addFirst("Aardvark");
        } catch (UnsupportedOperationException e) {
            System.out.println("addFirst() on TreeSet threw UnsupportedOperationException as expected.");
        }

        // TreeSet(Collection) and TreeSet(SortedSet) constructors
        TreeSet<String> fromCollection = new TreeSet<>(java.util.List.of("Zebra", "Ant"));
        System.out.println("TreeSet from a Collection: " + fromCollection);

        TreeSet<String> fromSortedSet = new TreeSet<>((SortedSet<String>) set);
        System.out.println("TreeSet copied from another SortedSet: " + fromSortedSet);
    }
}
