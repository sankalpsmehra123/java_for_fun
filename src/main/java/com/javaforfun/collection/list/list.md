# List (Interface)

| Property | Description |
| --- | --- |
| Version | Java 1.2 |  
| Storage Type | Heterogeneous Data. |
| Stores Null Values | Yes |
| Allows Duplicate | Yes |
| Insertion Order | Preserved |

## ArrayList (Class) 

### Features: 

| Property | Description |
| --- | --- |
| Version | Java 1.2 |  
| Storage Type | Heterogeneous Data. |
| Stores Null Values | Yes |
| Allows Duplicate | Yes |
| Method Call Type | NOT Synchronised |
| Insertion Order | Preserved |
| Underlying Data Structure | Resizable Array |
| Possible Cursors | Iterator, ListIterator |

ArrayList implements RandomAccess marked interface. 
Due to this it is able to access data quickly. 
But, it is very difficult to update or modify ArrayList 
as all the elements after the modified block have to be 
moved to the next blocks. Constructs an empty list with 
initial capacity of 10 after reaching max capacity it creates 
a new array list of new capacity and copies old array list 
into it.

> newCapacity  = (oldCapacity * 1.5) +1


### Constructors: 
- **ArrayList()** : Constructs an empty list with an initial capacity of ten.
- **ArrayList(int initialCapacity)** : Constructs an empty list with the specified initial capacity. 
- **ArrayList(Collection <? extends E> c)** : Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator. 

## LinkedList (Class) 

### Features: 

| Property | Description |
| --- | --- |
| Version | Java 1.2 |  
| Storage Type | Heterogeneous Data. |
| Stores Null Values | Yes |
| Allows Duplicate | Yes |
| Method Call Type | NOT Synchronised  |
| Insertion Order | Preserved |
| Underlying Data Structure | Doubly Linked List |
| Possible Cursors | Iterator, ListIterator |

LinkedList Has to traverse through each node to search an element. Due to data access is slow. But, it is really easy and quick to modify or update LinkedList.

### ArrayList vs LinkedList
Data in ArrayList is stored in array format (contiguous memory location). ArrayList does implement RandomAccess `marker` interface. Data in LinkedList is stored in a doubly linked list format. LinkedList does not implement RandomAccess `marker` interface.

### Constructors: 

1. **LinkedList()**  
: Constructs an empty list. 
2. **LinkedList(Collection <? extends E> c)**  
: Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator. 

## Vector (Class) 

### Features: 

| Property | Description |
| --- | --- |
| Version | Java 1.0 |  
| Storage Type | Heterogeneous Data. |
| Stores Null Values | Yes |
| Allows Duplicate | Yes |
| Method Call Type | Synchronised |
| Insertion Order | Preserved |
| Underlying Data Structure | Resizable Array |
| Possible Cursors | Iterator, ListIterator, Enumeration | 
 

Vector implements RandomAccess marked interface. Due to this it is able to access data quickly. But, it is very difficult to update or modify a Vector as all the elements after the modified block have to be moved to the next blocks. 

### Vector vs ArrayList  
Vectors are synchronized and ArrayList are not synchronized  
Vectors have 4 constructors where as ArrayList have 3

### Child Class:
[Stack (Class)](list.md#stack-class)

### Constructors: 

1. **Vector()**  
: Constructs an empty vector so that its internal data array has size 10 and its standard capacity increment is zero. 
2. **Vector(int initialCapacity)**  
: Constructs an empty vector with the specified initial capacity and with its capacity increment equal to zero. 
3. **Vector(int initialCapacity, int capacityIncrement)**  
: Constructs an empty vector with the specified initial capacity and capacity increment. 
4. **Vector(Collection <? extends E> c)**  
: Constructs a vector containing the elements of the specified collection, in the order they are returned by the collection's iterator. 


## Stack (Class) 

### Features: 

| Property | Description |
| --- | --- |
| Version | Java 1.0 |  
| Storage Type | Heterogeneous Data. |
| Stores Null Values | Yes |
| Allows Duplicate | Yes |
| Method Call Type | Synchronised |
| Insertion Order | Preserved |
| Underlying Data Structure | Resizable Array |
| Possible Cursors | Iterator, ListIterator, Enumeration |


Stack implements RandomAccess marked interface. Due to this it is able to access data quickly. But, it is very difficult to update or modify a Stack as all the elements after the modified block have to be moved to the next blocks. 

### Stack v/s Vector: 

- Stack follows LIFO (last in first out). 

### Parent Class:
[Vector (Class)](list.md#vector-class)

### Constructors: 

1. Stack(): Creates an empty Stack. 

## Methods in List:

> Note:  
> These are the methods declared on the `List` interface itself. `List` also inherits all
> `Collection` methods (`add(E)`, `remove(Object)`, `size()`, etc.) documented in [Collection](/src/main/java/com/javaforfun/collection/collection.md#methods-in-collection-class).

| Modifier and Type | Method | Description |
| :--- | :--- | :--- |
| `void` | `add(int index, E element)` | Inserts the specified element at the specified position in this list. |
| `default void` | `addFirst(E e)` | Adds an element as the first element of this collection (optional operation). |
| `default void` | `addLast(E e)` | Adds an element as the last element of this collection (optional operation). |
| `static <E> List<E>` | `copyOf(Collection<? extends E> coll)` | Returns an unmodifiable List containing the elements of the given Collection. |
| `boolean` | `equals(Object o)` | Compares the specified object with this list for equality. |
| `E` | `get(int index)` | Returns the element at the specified position in this list. |
| `default E` | `getFirst()` | Gets the first element of this collection. |
| `default E` | `getLast()` | Gets the last element of this collection. |
| `int` | `hashCode()` | Returns the hash code value for this list. |
| `int` | `indexOf(Object o)` | Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. |
| `int` | `lastIndexOf(Object o)` | Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element. |
| `ListIterator<E>` | `listIterator()` | Returns a list iterator over the elements in this list. |
| `ListIterator<E>` | `listIterator(int index)` | Returns a list iterator starting at the specified position in this list. |
| `static <E> List<E>` | `of(E... elements)` | Returns an unmodifiable list containing an arbitrary number of elements. |
| `E` | `remove(int index)` | Removes the element at the specified position in this list. |
| `default E` | `removeFirst()` | Removes and returns the first element of this collection. |
| `default E` | `removeLast()` | Removes and returns the last element of this collection. |
| `default void` | `replaceAll(UnaryOperator<E> operator)` | Replaces each element of this list with the result of applying the operator to that element. |
| `default SequencedCollection<E>` | `reversed()` | Returns a reverse-ordered view of this collection. |
| `E` | `set(int index, E element)` | Replaces the element at the specified position in this list with the specified element. |
| `default void` | `sort(Comparator<? super E> c)` | Sorts this list according to the order induced by the specified Comparator. |
| `List<E>` | `subList(int fromIndex, int toIndex)` | Returns a view of the portion of this list between fromIndex, inclusive, and toIndex, exclusive. |


Examples of the `removeIf()` method:
1. Removing even numbers from a list
    ```java
    List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    numbers.removeIf(num -> num % 2 == 0);
    System.out.println(numbers); // [1, 3, 5]
    ```
2. Removing strings that match "Tuesday" from a list
    ```java
    List<String> days = new ArrayList<>(List.of("Tuesday", "Wednesday"));
    days.removeIf(day -> day.equals("Tuesday"));
    System.out.println(days); // ["Wednesday"]
    ```
3. `remove(int)` vs `remove(Object)` for a `List<Integer>`
    ```java
    List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 30));
    numbers.remove(30); // resolves to remove(int index) -> throws IndexOutOfBoundsException (only indexes 0-4 exist)
    numbers.remove(Integer.valueOf(30)); // resolves to remove(Object o) -> removes the value 30 from the list
    ```