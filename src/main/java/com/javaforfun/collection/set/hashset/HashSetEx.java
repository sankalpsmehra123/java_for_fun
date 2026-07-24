package com.javaforfun.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        // Creating a HashSet with default initial capacity (16) and load factor (0.75)
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");

        // Duplicate elements are silently ignored, add() returns false
        boolean added = set.add("Apple");
        System.out.println("Adding duplicate 'Apple' returned: " + added);

        // HashSet allows a single null value
        set.add(null);

        // Displaying the HashSet - note insertion order is NOT preserved
        System.out.println("HashSet: " + set);

        // Checking if an element exists in the HashSet
        String fruitToCheck = "Banana";
        if (set.contains(fruitToCheck)) {
            System.out.println(fruitToCheck + " is present in the HashSet.");
        } else {
            System.out.println(fruitToCheck + " is not present in the HashSet.");
        }

        // size() / isEmpty()
        System.out.println("Size: " + set.size());
        System.out.println("Is empty: " + set.isEmpty());

        // Removing an element from the HashSet
        set.remove("Grapes");
        System.out.println("HashSet after removing Grapes: " + set);

        // Iterating through the HashSet using the enhanced for loop
        System.out.println("Iterating through the HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Iterating explicitly with an Iterator (needed if you want to remove while iterating)
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if ("Mango".equals(fruit)) {
                iterator.remove(); // safe removal during iteration, unlike set.remove()
            }
        }
        System.out.println("HashSet after Iterator removal of Mango: " + set);

        // toArray() - copies the set contents into an array
        Object[] array = set.toArray();
        System.out.println("As array: " + java.util.Arrays.toString(array));

        // clone() - shallow copy, elements themselves are shared, not duplicated
        @SuppressWarnings("unchecked")
        HashSet<String> cloned = (HashSet<String>) set.clone();
        cloned.add("Kiwi");
        System.out.println("Original after cloning and modifying clone: " + set);
        System.out.println("Cloned set: " + cloned);

        // clear() - removes all elements
        cloned.clear();
        System.out.println("Cloned set after clear(): " + cloned + ", isEmpty: " + cloned.isEmpty());
    }
}
