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
| Underlaying Data Structure | Resizable Array |
| Possible Cursors | Iterator, ListIterator |

ArrayList implements RandomAccess marked interface. Due to this it is able to access data quickly. But, it is very difficult to update or modify ArrayList as all the elements after the modified block have to be moved to the next blocks. 

### Constructors: 

1. **ArrayList()**  
: Constructs an empty list with an initial capacity of ten. 
2. **ArrayList(int initialCapacity)**  
: Constructs an empty list with the specified initial capacity. 
3. **ArrayList(Collection <? extends E> c)**  
: Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator. 

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
| Underlaying Data Structure | Double Linked List |
| Possible Cursors | Iterator, ListIterator |

LinkedList Has to traverse through each node to search an element. Due to data access is slow. But, it is really easy and quick to modify or update LinkedList.

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
| Underlaying Data Structure | Resizable Array |
| Possible Cursors | Iterator, ListIterator, Enumerator | 
 

Vector implements RandomAccess marked interface. Due to this it is able to access data quickly. But, it is very difficult to update or modify ArrayList as all the elements after the modified block have to be moved to the next blocks. 

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
| Underlaying Data Structure | Resizable Array |
| Possible Cursors | Iterator, ListIterator, Enumerator |


Stack implements RandomAccess marked interface. Due to this it is able to access data quickly. But, it is very difficult to update or modify ArrayList as all the elements after the modified block have to be moved to the next blocks. 

### Stack v/s Vector: 

- Stack follows LIFO (last in first out). 

### Parent Class:
[Vector (Class)](list.md#vector-class)

### Constructors: 

1. Stack(): Creates an empty Stack. 

## Most Used Methods in List: 

- **add(E e)** : Ensures that this collection contains the specified element (optional operation).
- **addAll(Collection<? extends E> c)** : Adds all of the elements in the specified collection to this collection (optional operation).
- **addAll(int index, Collection<? extends E> c)** : Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
- **addFirst(E e)** : Adds an element as the first element of this collection (optional operation).
- **addLast(Ee)** : Adds an element as the last element of this collection (optional operation).
- **clear()** : Removes all of the elements from this collection (optional operation).
- **contains(Object o)** : Returns true if this collection contains the specified element
- **containsAll(Collection<?> c)** : Returns true if this collection contains all of the elements in the specified collection. 
- **equals(Object o)** : Compares the specified object with this collection for equality. 
- **retainAll(Collection<?> c)** : Retains only the elements in this collection that are contained in the specified collection (optional operation). 
- **remove(Object o)** : Removes a single instance of the specified element from this collection, if it is present (optional operation). 
- **removeAll(Collection<?> c)** : Removes all of this collection's elements that are also contained in the specified collection (optional operation). 
- **removeFirst()** : Removes and returns the first element of this collection (optional operation). 
- **removeLast()** : Removes and returns the last element of this collection (optional operation). 
- **subList(int fromIndex, int toIndex)** : Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. 
- **sort(Comparator<? super E> c)** : Sorts this list according to the order induced by the specified Comparator. 
- **removeIf(Predicate<? super E> filter)** : Removes all of the elements of this collection that satisfy the given predicate. 
- **set(int index, E element)** : Replaces the element at the specified position in this list with the specified element (optional operation). 
- **get(int index)** : Returns the element at the specified position in this list. 
- **getFirst()** : Gets the first element of this collection. 
- **getLast()** : Gets the last element of this collection. 

Example of removeIf() method in point 17:  
1. Removing even numbers from an list
    ```java
    List<lnteger> numbers = Arrays.asList(1, 2, 3, 4, 5);
    numbers.removelf(num —> num % 2);
    System.out.println(numbers); // [1, 3, 5]
    ```
2. Removing strings that end with "day" from an list 
    ```java
    List<String> days = Arrays.asList("Tuesday", "Wednesday");  
    days.removelf(day -> day.equals("Tuesday")); 
    System. out.println(days); // ["Wednesday"] 
    ```