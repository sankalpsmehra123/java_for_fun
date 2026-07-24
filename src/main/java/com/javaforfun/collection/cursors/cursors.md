# Cursors

We can read the data from Collections using 4 ways:
1. Using for/ for-each loop
2. Using get method
3. Using cursors:
    1. Enumeration
    2. Iterator
    3. ListIterator
4. Using forEach() method

### Enumeration

- We can read data from only legacy classes like Vector and Stack (Java 1.0)
- So it is not universal
- We will get this object using the elements() method `Enumeration<String> e = vector.elements()`
- It contains 2 methods:
    - hasMoreElements(): to check data is available or not
    - nextElement(): to read the data
- Using this cursor we can only read operations
- Only forward cursor

### Iterator

- We can read the data from all classes (Java 1.2)
- So it is a universal cursor
- We will get this object using the iterator() method `Iterator itr = arrayList.iterator()`
- It contains methods:
    - hasNext(): to check data is available or not
    - next(): to read the data
    - remove(): to remove the data
    - forEachRemaining(Consumer<? super E>): apply some transformations on remaining objects

- Using this cursor we can do read and remove operations
- Only forward cursor


### ListIterator

- We can read the data from only List implementation classes (Java 1.2)
- So it is not a universal cursor
- We will get this object using the listIterator() method `ListIterator itr = arrayList.listIterator()`
- It contains methods:
    - hasNext(): to check data is available or not in forward direction
    - next(): to read the data in forward direction
    - nextIndex(): to get the next index in forward direction
    - remove(): to remove the data
    - hasPrevious(): to check data is available or not
    - previous(): to read the data in backward direction
    - previousIndex(): to get the previous index in the previous direction.
    - set(E): update data in current location
    - add(E): add data in current location
- Using this cursor we can do read, add, update and remove operations
- Forward and backward direction


> Note:  
> ArrayList: Iterator, ListIterator  
> Vector: Enumeration, Iterator, ListIterator  
> HashSet: Iterator  