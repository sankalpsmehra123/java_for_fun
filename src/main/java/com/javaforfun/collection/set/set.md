# Set

| Property | Description |
| --- | --- |  
| Storage Type | Heterogeneous Data. |
| Stores Null Values | Yes |
| Allows Duplicate | No |
| Insertion Order | Not Preserved |

## HashSet

| Property | Description |
| --- | --- |
| Version | Java 1.2 |  
| Storage Type | Heterogeneous Data. |
| Stores Null Values | Yes |
| Allows Duplicate | No |
| Method Call Type | Not Synchronised |
| Insertion Order | Not Preserved |
| Underlying Data Structure | Hash Table |
| Possible Cursors | Iterator |

### Sub-class:

LinkedHashSet(C)

### Constructor:

**HashSet()**:  
Constructs a new, empty set; the backing `HashMap` instance has default initial capacity (16) and load factor (0.75).

**HashSet(int initialCapacity)**:  
Constructs a new, empty set; the backing `HashMap` instance has the specified initial capacity and default load factor (0.75).

**HashSet(int initialCapacity, float loadFactor)**:  
Constructs a new, empty set; the backing `HashMap` instance has the specified initial capacity and the specified load factor.

**HashSet(Collection<? extends E> c)**:  
Constructs a new set containing the elements in the specified collection.

> Note:  
> Load Factor is a measure of how full the set is allowed to get before its capacity is automatically increased (doubles). range is 0.0 to 1.0 default is 0.75 (or 75%).

### Methods:


| Modifier and Type | Method | Description |
| :--- | :--- | :--- |
| `boolean` | `add(E e)` | Adds the specified element to this set if it is not already present. |
| `void` | `clear()` | Removes all of the elements from this set. |
| `Object` | `clone()` | Returns a shallow copy of this HashSet instance: the elements themselves are not cloned. |
| `boolean` | `contains(Object o)` | Returns true if this set contains the specified element. |
| `boolean` | `isEmpty()` | Returns true if this set contains no elements. |
| `Iterator<E>` | `iterator()` | Returns an iterator over the elements in this set. |
| `static <T> HashSet<T>` | `newHashSet(int numElements)` | Creates a new, empty HashSet suitable for the expected number of elements. |
| `boolean` | `remove(Object o)` | Removes the specified element from this set if it is present. |
| `int` | `size()` | Returns the number of elements in this set (its cardinality). |
| `Spliterator<E>` | `spliterator()` | Creates a late-binding and fail-fast Spliterator over the elements in this set. |
| `Object[]` | `toArray()` | Returns an array containing all of the elements in this collection. |
| `<T> T[]` | `toArray(T[] a)` | Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array. |


## LinkedHashSet

| Property | Description |
| --- | --- |
| Version | Java 1.4 |  
| Storage Type | Heterogeneous Data. |
| Stores Null Values | Yes |
| Allows Duplicate | No |
| Method Call Type | Not Synchronised |
| Insertion Order | Preserved |
| Underlying Data Structure | Hash Table and Linked List |
| Possible Cursors | Iterator |

#### HashSet Vs LinkedHashSet
Insertion order is preserved in LinkedHashSet and not in HashSet

### Constructor:

**LinkedHashSet()**:  
Constructs a new, empty linked hash set with the default initial capacity (16) and load factor (0.75).

**LinkedHashSet(int initialCapacity)**:  
Constructs a new, empty linked hash set with the specified initial capacity and the default load factor (0.75).

**LinkedHashSet(int initialCapacity, float loadFactor)**:  
Constructs a new, empty linked hash set with the specified initial capacity and load factor.

**LinkedHashSet(Collection<? extends E> c)**:  
Constructs a new linked hash set with the same elements as the specified collection.

> Note:  
> Load Factor is a measure of how full the set is allowed to get before its capacity is automatically increased. range is 0.0 to 1.0

### Methods:


| Modifier and Type | Method | Description |
| :--- | :--- | :--- |
| `void` | `addFirst(E e)` | Adds an element as the first element of this collection (optional operation). |
| `void` | `addLast(E e)` | Adds an element as the last element of this collection (optional operation). |
| `E` | `getFirst()` | Gets the first element of this collection. |
| `E` | `getLast()` | Gets the last element of this collection. |
| `static <T> LinkedHashSet<T>` | `newLinkedHashSet(int numElements)` | Creates a new, empty LinkedHashSet suitable for the expected number of elements. |
| `E` | `removeFirst()` | Removes and returns the first element of this collection (optional operation). |
| `E` | `removeLast()` | Removes and returns the last element of this collection (optional operation). |
| `SequencedSet<E>` | `reversed()` | Returns a reverse-ordered view of this collection. |
| `Spliterator<E>` | `spliterator()` | Creates a late-binding and fail-fast Spliterator over the elements in this set. |


## TreeSet

| Property | Description |
| --- | --- |
| Version | Java 1.2 |  
| Storage Type | Homogeneous Data. |
| Stores Null Values | No |
| Allows Duplicate | No |
| Method Call Type | Not Synchronised |
| Insertion Order | Not Preserved |
| Underlying Data Structure | Balanced Tree |
| Possible Cursors | Iterator |

> Note:  
> Implements comparable interface

### Constructor:

**TreeSet()**:  
Constructs a new, empty tree set, sorted according to the natural ordering of its elements.

**TreeSet(Collection<? extends E> c)**:  
Constructs a new tree set containing the elements in the specified collection, sorted according to the *natural ordering* of its elements.

**TreeSet(Comparator<? super E> comparator)**:  
Constructs a new, empty tree set, sorted according to the specified comparator.

**TreeSet(SortedSet\<E> s)**:  
Constructs a new tree set containing the same elements and using the same ordering as the specified sorted set.

### Methods:


| Modifier and Type | Method | Description |
| :--- | :--- | :--- |
| `boolean` | `add(E e)` | Adds the specified element to this set if it is not already present. |
| `boolean` | `addAll(Collection<? extends E> c)` | Adds all of the elements in the specified collection to this set. |
| `void` | `addFirst(E e)` | Throws UnsupportedOperationException. |
| `void` | `addLast(E e)` | Throws UnsupportedOperationException. |
| `E` | `ceiling(E e)` | Returns the least element in this set greater than or equal to the given element, or null if there is no such element. |
| `void` | `clear()` | Removes all of the elements from this set. |
| `Object` | `clone()` | Returns a shallow copy of this TreeSet instance. |
| `Comparator<? super E>` | `comparator()` | Returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements. |
| `boolean` | `contains(Object o)` | Returns true if this set contains the specified element. |
| `Iterator<E>` | `descendingIterator()` | Returns an iterator over the elements in this set in descending order. |
| `NavigableSet<E>` | `descendingSet()` | Returns a reverse order view of the elements contained in this set. |
| `E` | `first()` | Returns the first (lowest) element currently in this set. |
| `E` | `floor(E e)` | Returns the greatest element in this set less than or equal to the given element, or null if there is no such element. |
| `SortedSet<E>` | `headSet(E toElement)` | Returns a view of the portion of this set whose elements are strictly less than toElement. |
| `NavigableSet<E>` | `headSet(E toElement, boolean inclusive)` | Returns a view of the portion of this set whose elements are less than (or equal to, if inclusive is true) toElement. |
| `E` | `higher(E e)` | Returns the least element in this set strictly greater than the given element, or null if there is no such element. |
| `boolean` | `isEmpty()` | Returns true if this set contains no elements. |
| `Iterator<E>` | `iterator()` | Returns an iterator over the elements in this set in ascending order. |
| `E` | `last()` | Returns the last (highest) element currently in this set. |
| `E` | `lower(E e)` | Returns the greatest element in this set strictly less than the given element, or null if there is no such element. |
| `E` | `pollFirst()` | Retrieves and removes the first (lowest) element, or returns null if this set is empty (optional operation). |
| `E` | `pollLast()` | Retrieves and removes the last (highest) element, or returns null if this set is empty (optional operation). |
| `boolean` | `remove(Object o)` | Removes the specified element from this set if it is present. |
| `int` | `size()` | Returns the number of elements in this set (its cardinality). |
| `Spliterator<E>` | `spliterator()` | Creates a late-binding and fail-fast Spliterator over the elements in this set. |
| `NavigableSet<E>` | `subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)` | Returns a view of the portion of this set whose elements range from fromElement to toElement. |
| `SortedSet<E>` | `subSet(E fromElement, E toElement)` | Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive. |
| `SortedSet<E>` | `tailSet(E fromElement)` | Returns a view of the portion of this set whose elements are greater than or equal to fromElement. |
| `NavigableSet<E>` | `tailSet(E fromElement, boolean inclusive)` | Returns a view of the portion of this set whose elements are greater than (or equal to, if inclusive is true) fromElement. |
