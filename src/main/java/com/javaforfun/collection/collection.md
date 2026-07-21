# Collection

[Cursors](/src/main/java/com/javaforfun/collection/cursors/cursors.md) are used to read the data form Collection classes

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
java.util

[//]: # (If the links above are not working please change the first "/folderPath/" directory name to your directory name so that the path looks like /<your_directory_name>/<fileName>)