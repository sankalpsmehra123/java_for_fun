# Map

![Map Hierarchy In Java](https://scaler.com/topics/images/standard-map-interface-hierarchy.webp)

Used to store `key:value` Pair.  
key and value both are Objects key value pair is called entries.  
key must be unique values must can be duplicate.

| Property | Description |
| --- | --- |  
| Storage Type | Heterogeneous Data. |
| Stores Null Values | Yes |
| Allows Duplicate | No duplicate keys, duplicate values allowed |
| Insertion Order | Not Preserved |

### Sub-Classes OR Interfaces
1. [HashMap](/src/main/java/com/javaforfun/map/map.md#hashmap)
2. [LinkedHashMap](/src/main/java/com/javaforfun/map/map.md#linkedhashmap)
3. [TreeMap](/src/main/java/com/javaforfun/map/map.md#treemap)

### Difference:

#### Map Vs Collections
[**Collection**](/src/main/java/com/javaforfun/collection/collection.md) is used to store group of objects example [1,2,3,4,5]. Its root interface is Collection Interface

[**Map**](/src/main/java/com/javaforfun/map/map.md) is used to store {key:value} pair example {sankalp:23, abhishek:25} . Its root interface is Map Interface

### Package
`java.util`

## HashMap

| Property | Description |
| --- | --- |
| Version | Java 1.2 |  
| Storage Type | Heterogeneous Data. |
| Stores Null Key:Values | Yes |
| Allows Duplicate | No duplicate keys, duplicate values allowed |
| Method Call Type | Not Synchronised |
| Insertion Order | Not Preserved |
| Underlying Data Structure | Hash Table |
| Possible Cursors | Iterator |

### Sub-class:

LinkedHashMap(C)

### Constructor:

**HashMap()**:  
Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75).

**HashMap(int initialCapacity)**:  
Constructs an empty HashMap with the specified initial capacity and the default load factor (0.75).

**HashMap(int initialCapacity, float loadFactor)**:  
Constructs an empty HashMap with the specified initial capacity and load factor.

**HashMap(Map<? extends K, ? extends V> m)**:  
Constructs a new HashMap with the same mappings as the specified Map.

> Note:  
> Load Factor is a measure of how full the set is allowed to get before its capacity is automatically increased (doubles). range is 0.0 to 1.0 default is 0.75 (or 75%).

### Methods:



| Modifier and Type | Method | Description |
| :--- | :--- | :--- |
| `void` | `clear()` | Removes all of the mappings from this map. |
| `Object` | `clone()` | Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned. |
| `V` | `compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)` | Attempts to compute a mapping for the specified key and its current mapped value, or null if there is no current mapping (optional operation). |
| `V` | `computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)` | If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null (optional operation). |
| `V` | `computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)` | If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value (optional operation). |
| `boolean` | `containsKey(Object key)` | Returns true if this map contains a mapping for the specified key. |
| `boolean` | `containsValue(Object value)` | Returns true if this map maps one or more keys to the specified value. |
| `Set<Map.Entry<K,V>>` | `entrySet()` | Returns a Set view of the mappings contained in this map. |
| `V` | `get(Object key)` | Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key. |
| `boolean` | `isEmpty()` | Returns true if this map contains no key-value mappings. |
| `Set<K>` | `keySet()` | Returns a Set view of the keys contained in this map. |
| `V` | `merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)` | If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value (optional operation). |
| `static <K,V> HashMap<K,V>` | `newHashMap(int numMappings)` | Creates a new, empty HashMap suitable for the expected number of mappings. |
| `V` | `put(K key, V value)` | Associates the specified value with the specified key in this map. |
| `void` | `putAll(Map<? extends K, ? extends V> m)` | Copies all of the mappings from the specified map to this map. |
| `V` | `remove(Object key)` | Removes the mapping for the specified key from this map if present. |
| `int` | `size()` | Returns the number of key-value mappings in this map. |
| `Collection<V>` | `values()` | Returns a Collection view of the values contained in this map. |



## LinkedHashMap

| Property | Description |
| --- | --- |
| Version | Java 1.4 |  
| Storage Type | Heterogeneous Data. |
| Stores Null Key:Values | Yes |
| Allows Duplicate | No duplicate keys, duplicate values allowed |
| Method Call Type | Not Synchronised |
| Insertion Order | Preserved |
| Underlying Data Structure | Hash Table and Linked List |
| Possible Cursors | Iterator |

#### HashMap Vs LinkedHashMap
Insertion order is preserved in LinkedHashMap and not in HashMap

### Constructor:

**LinkedHashMap()**:  
Constructs an empty insertion-ordered LinkedHashMap instance with the default initial capacity (16) and load factor (0.75).

**LinkedHashMap(int initialCapacity)**:  
Constructs an empty insertion-ordered LinkedHashMap instance with the specified initial capacity and a default load factor (0.75).

**LinkedHashMap(int initialCapacity, float loadFactor)**:  
Constructs an empty insertion-ordered LinkedHashMap instance with the specified initial capacity and load factor.

**LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)**:  
Constructs an empty LinkedHashMap instance with the specified initial capacity, load factor and ordering mode.

**LinkedHashMap(Map<? extends K, ? extends V> m)**:  
Constructs an insertion-ordered LinkedHashMap instance with the same mappings as the specified map.


> Note:  
> Load Factor is a measure of how full the set is allowed to get before its capacity is automatically increased. range is 0.0 to 1.0

### Methods:



| Modifier and Type | Method | Description |
| :--- | :--- | :--- |
| `void` | `clear()` | Removes all of the mappings from this map. |
| `boolean` | `containsValue(Object value)` | Returns true if this map maps one or more keys to the specified value. |
| `Set<Map.Entry<K,V>>` | `entrySet()` | Returns a Set view of the mappings contained in this map. |
| `V` | `get(Object key)` | Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key. |
| `Set<K>` | `keySet()` | Returns a Set view of the keys contained in this map. |
| `static <K,V> LinkedHashMap<K,V>` | `newLinkedHashMap(int numMappings)` | Creates a new, empty, insertion-ordered LinkedHashMap suitable for the expected number of mappings. |
| `V` | `putFirst(K k, V v)` | Inserts the given mapping into the map if it is not already present, or replaces the value of a mapping if it is already present (optional operation). |
| `V` | `putLast(K k, V v)` | Inserts the given mapping into the map if it is not already present, or replaces the value of a mapping if it is already present (optional operation). |
| `protected boolean` | `removeEldestEntry(Map.Entry<K,V> eldest)` | Returns true if this map should remove its eldest entry. |
| `SequencedMap<K,V>` | `reversed()` | Returns a reverse-ordered view of this map. |
| `SequencedSet<Map.Entry<K,V>>` | `sequencedEntrySet()` | Returns a SequencedSet view of this map's entrySet. |
| `SequencedSet<K>` | `sequencedKeySet()` | Returns a SequencedSet view of this map's keySet. |
| `SequencedCollection<V>` | `sequencedValues()` | Returns a SequencedCollection view of this map's values collection. |
| `Collection<V>` | `values()` | Returns a Collection view of the values contained in this map. |



## TreeMap

| Property | Description |
| --- | --- |
| Version | Java 1.2 |  
| Storage Type | Homogeneous Data. |
| Stores Null Key:Values | Yes |
| Allows Duplicate | No duplicate keys, duplicate values allowed |
| Method Call Type | Not Synchronised |
| Insertion Order | Not Preserved, Natural order |
| Underlying Data Structure | Red-Black Tree |
| Possible Cursors | Iterator |

> Note:  
> Implements comparable interface

### Constructor:

**TreeMap()**:  
Constructs a new, empty tree map, using the natural ordering of its keys.

**TreeMap(Comparator<? super K> comparator)**:  
Constructs a new, empty tree map, ordered according to the given comparator.

**TreeMap(Map<? extends K, ? extends V> m)**:  
Constructs a new tree map containing the same mappings as the given map, ordered according to the natural ordering of its keys.

**TreeMap(SortedMap<K, ? extends V> m)**:  
Constructs a new tree map containing the same mappings and using the same ordering as the specified sorted map.


### Methods:



| Modifier and Type | Method | Description |
| :--- | :--- | :--- |
| `Map.Entry<K,V>` | `ceilingEntry(K key)` | Returns a key-value mapping associated with the least key greater than or equal to the given key, or null if there is no such key. |
| `K` | `ceilingKey(K key)` | Returns the least key greater than or equal to the given key, or null if there is no such key. |
| `void` | `clear()` | Removes all of the mappings from this map. |
| `Object` | `clone()` | Returns a shallow copy of this TreeMap instance. |
| `Comparator<? super K>` | `comparator()` | Returns the comparator used to order the keys in this map, or null if this map uses the natural ordering of its keys. |
| `V` | `compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)` | Attempts to compute a mapping for the specified key and its current mapped value, or null if there is no current mapping (optional operation). |
| `V` | `computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)` | If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null (optional operation). |
| `V` | `computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)` | If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value (optional operation). |
| `boolean` | `containsKey(Object key)` | Returns true if this map contains a mapping for the specified key. |
| `boolean` | `containsValue(Object value)` | Returns true if this map maps one or more keys to the specified value. |
| `NavigableSet<K>` | `descendingKeySet()` | Returns a reverse order NavigableSet view of the keys contained in this map. |
| `NavigableMap<K,V>` | `descendingMap()` | Returns a reverse order view of the mappings contained in this map. |
| `Set<Map.Entry<K,V>>` | `entrySet()` | Returns a Set view of the mappings contained in this map. |
| `Map.Entry<K,V>` | `firstEntry()` | Returns a key-value mapping associated with the least key in this map, or null if the map is empty. |
| `K` | `firstKey()` | Returns the first (lowest) key currently in this map. |
| `Map.Entry<K,V>` | `floorEntry(K key)` | Returns a key-value mapping associated with the greatest key less than or equal to the given key, or null if there is no such key. |
| `K` | `floorKey(K key)` | Returns the greatest key less than or equal to the given key, or null if there is no such key. |
| `V` | `get(Object key)` | Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key. |
| `SortedMap<K,V>` | `headMap(K toKey)` | Returns a view of the portion of this map whose keys are strictly less than toKey. |
| `NavigableMap<K,V>` | `headMap(K toKey, boolean inclusive)` | Returns a view of the portion of this map whose keys are less than (or equal to, if inclusive is true) toKey. |
| `Map.Entry<K,V>` | `higherEntry(K key)` | Returns a key-value mapping associated with the least key strictly greater than the given key, or null if there is no such key. |
| `K` | `higherKey(K key)` | Returns the least key strictly greater than the given key, or null if there is no such key. |
| `Set<K>` | `keySet()` | Returns a Set view of the keys contained in this map. |
| `Map.Entry<K,V>` | `lastEntry()` | Returns a key-value mapping associated with the greatest key in this map, or null if the map is empty. |
| `K` | `lastKey()` | Returns the last (highest) key currently in this map. |
| `Map.Entry<K,V>` | `lowerEntry(K key)` | Returns a key-value mapping associated with the greatest key strictly less than the given key, or null if there is no such key. |
| `K` | `lowerKey(K key)` | Returns the greatest key strictly less than the given key, or null if there is no such key. |
| `V` | `merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)` | If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value (optional operation). |
| `NavigableSet<K>` | `navigableKeySet()` | Returns a NavigableSet view of the keys contained in this map. |
| `Map.Entry<K,V>` | `pollFirstEntry()` | Removes and returns a key-value mapping associated with the least key in this map, or null if the map is empty (optional operation). |
| `Map.Entry<K,V>` | `pollLastEntry()` | Removes and returns a key-value mapping associated with the greatest key in this map, or null if the map is empty (optional operation). |
| `V` | `put(K key, V value)` | Associates the specified value with the specified key in this map. |
| `void` | `putAll(Map<? extends K, ? extends V> map)` | Copies all of the mappings from the specified map to this map. |
| `V` | `putFirst(K k, V v)` | Throws UnsupportedOperationException. |
| `V` | `putLast(K k, V v)` | Throws UnsupportedOperationException. |
| `V` | `remove(Object key)` | Removes the mapping for this key from this TreeMap if present. |
| `int` | `size()` | Returns the number of key-value mappings in this map. |
| `NavigableMap<K,V>` | `subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)` | Returns a view of the portion of this map whose keys range from fromKey to toKey. |
| `SortedMap<K,V>` | `subMap(K fromKey, K toKey)` | Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive. |
| `SortedMap<K,V>` | `tailMap(K fromKey)` | Returns a view of the portion of this map whose keys are greater than or equal to fromKey. |
| `NavigableMap<K,V>` | `tailMap(K fromKey, boolean inclusive)` | Returns a view of the portion of this map whose keys are greater than (or equal to, if inclusive is true) fromKey. |
| `Collection<V>` | `values()` | Returns a Collection view of the values contained in this map. |
