# Collection

[Cursors](/src/main/java/com/javaforfun/collection/cursors/cursors.md) are used to read the data form Collection classes

| Primitive Type | Wrapper Class | Size / Internal Nature |
| :--- | :--- | :--- |
| `byte` | `Byte` | 8-bit signed integer |
| `short` | `Short` | 16-bit signed integer |
| `int` | `Integer` | 32-bit signed integer |
| `long` | `Long` | 64-bit signed integer |
| `float` | `Float` | 32-bit floating point |
| `double` | `Double` | 64-bit floating point |
| `char` | `Character` | 16-bit Unicode character |
| `boolean` | `Boolean` | Logical true/false value |

#### Generics:
To Provide type safety to Collection we use concepts called `Generics`

#### Auto-Boxing:
Collection in java use  `auto-boxing` concept to automatically convert primitive types into Objects

### Sub-Classes OR Interfaces
1. [List](/src/main/java/com/javaforfun/collection/list/list.md)
   1. [ArrayList](/src/main/java/com/javaforfun/collection/list/list.md)
   2. [LinkedList](/src/main/java/com/javaforfun/collection/list/list.md)
   3. [Vector](/src/main/java/com/javaforfun/collection/list/list.md)
   4. [Stack](/src/main/java/com/javaforfun/collection/list/list.md)
2. [Set](/src/main/java/com/javaforfun/collection/set/set.md) 
   1. [HashSet](/src/main/java/com/javaforfun/collection/set/hashset/hashset.md)
   2. [LinkedHashSet](/src/main/java/com/javaforfun/collection/set/linkedhashset/linkedhashset.md)
   3. [TreeSet](/src/main/java/com/javaforfun/collection/set/treeset/treeset.md)
3. [Queue](/src/main/java/com/javaforfun/collection/queue/queue.md)
   1. [PriorityQueue](/src/main/java/com/javaforfun/collection/queue/priorityqueue/priorityqueue.md)
   2. [Deque](/src/main/java/com/javaforfun/collection/queue/deque/deque.md)
      1. [ArrayDeque](/src/main/java/com/javaforfun/collection/queue/deque/arraydeque/arraydeque.md)

### Difference: 

#### Arrays V/s collection

Both arrays and collection are used to represent group of objects as single entity but

#### Arrays:
1. Stores group of objects: homogenous
2. Arrays are fixed in size: once created we cannot increase or decrease the size.
```java 
   int[] numbers = new int[5]; // the size is fixed for bigger array you need a new one. 
   ```
3. Not recommended memory wise.
4. No methods available
5. It can store both primitive data types and object data

#### Collection:
1. Stores group of objects: homogenous & heterogeneous
2. collection are dynamic
3. Memory wise good
4. Support methods making operations easy
5. Can store only object data NOT primitive data.
#### Map Vs collection
[**Collection**](/src/main/java/com/javaforfun/collection/collection.md) is used to store group of objects example [1,2,3,4,5]. Its root interface is Collection Interface

[**Map**](/src/main/java/com/javaforfun/map/map.md)  is used to store {key:value} pair example {sankalp:23, abhishek:25} . Its root interface is Map Interface

> NOTE:   
> parent interface of Collection interface is Iterable

### Package
`java.util`  
Collection  
`java.util.function`  
Collections with functional programming has concepts like FlatMap, filter, Mapper

## Methods in Collection class

| Modifier and Type | Method | Description |
| :--- | :--- | :--- |
| `boolean` | `add(E e)` | Ensures that this collection contains the specified element (optional operation). |
| `boolean` | `addAll(Collection<? extends E> c)` | Adds all of the elements in the specified collection to this collection (optional operation). |
| `void` | `clear()` | Removes all of the elements from this collection (optional operation). |
| `boolean` | `contains(Object o)` | Returns true if this collection contains the specified element. |
| `boolean` | `containsAll(Collection<?> c)` | Returns true if this collection contains all of the elements in the specified collection. |
| `boolean` | `equals(Object o)` | Compares the specified object with this collection for equality. |
| `int` | `hashCode()` | Returns the hash code value for this collection. |
| `boolean` | `isEmpty()` | Returns true if this collection contains no elements. |
| `Iterator<E>` | `iterator()` | Returns an iterator over the elements in this collection. |
| `default Stream<E>` | `parallelStream()` | Returns a possibly parallel Stream with this collection as its source. |
| `boolean` | `remove(Object o)` | Removes a single instance of the specified element from this collection, if it is present (optional operation). |
| `boolean` | `removeAll(Collection<?> c)` | Removes all of this collection's elements that are also contained in the specified collection (optional operation). |
| `default boolean` | `removeIf(Predicate<? super E> filter)` | Removes all of the elements of this collection that satisfy the given predicate (optional operation). |
| `boolean` | `retainAll(Collection<?> c)` | Retains only the elements in this collection that are contained in the specified collection (optional operation). |
| `int` | `size()` | Returns the number of elements in this collection. |
| `default Spliterator<E>` | `spliterator()` | Creates a Spliterator over the elements in this collection. |
| `default Stream<E>` | `stream()` | Returns a sequential Stream with this collection as its source. |
| `Object[]` | `toArray()` | Returns an array containing all of the elements in this collection. |
| `default <T> T[]` | `toArray(IntFunction<T[]> generator)` | Returns an array containing all of the elements in this collection, using the provided generator function to allocate the returned array. |
| `<T> T[]` | `toArray(T[] a)` | Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array. |

> Important Note:  
>(If the links above are not working please change the first "/folderPath/" directory name to your directory name so that the path looks like /<your_directory_name>/<fileName>)