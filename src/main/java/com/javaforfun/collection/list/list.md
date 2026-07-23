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
| Underlaying Data Structure | Double Linked List |
| Possible Cursors | Iterator, ListIterator |

LinkedList Has to traverse through each node to search an element. Due to data access is slow. But, it is really easy and quick to modify or update LinkedList.

### ArrayList vs LinkedList
Data in ArrayList is stored in array format (continous memory location). ArrayList does implement RandomAccess `marker` interface. Data in LinkedList is stored in DoubleLinkedList format. LinkedList does not implement RandomAccess `marker` interface.

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

### Voctor vs ArrayList  
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
| Underlaying Data Structure | Resizable Array |
| Possible Cursors | Iterator, ListIterator, Enumerator |


Stack implements RandomAccess marked interface. Due to this it is able to access data quickly. But, it is very difficult to update or modify ArrayList as all the elements after the modified block have to be moved to the next blocks. 

### Stack v/s Vector: 

- Stack follows LIFO (last in first out). 

### Parent Class:
[Vector (Class)](list.md#vector-class)

### Constructors: 

1. Stack(): Creates an empty Stack. 

## Methods in List: 


| Modifier and Type | Method | Description |
| :--- | :--- | :--- |
| `void` | `add(String item)` | Adds the specified item to the end of scrolling list. |
| `void` | `add(String item, int index)` | Adds the specified item to the scrolling list at the position indicated by the index. |
| `void` | `addActionListener(ActionListener l)` | Adds the specified action listener to receive action events from this list. |
| `void` | `addItem(String item)` | Deprecated. Replaced by add(String). |
| `void` | `addItem(String item, int index)` | Deprecated. Replaced by add(String, int). |
| `void` | `addItemListener(ItemListener l)` | Adds the specified item listener to receive item events from this list. |
| `void` | `addNotify()` | Creates the peer for the list. |
| `boolean` | `allowsMultipleSelections()` | Deprecated. As of JDK version 1.1, replaced by isMultipleMode(). |
| `void` | `clear()` | Deprecated. As of JDK version 1.1, replaced by removeAll(). |
| `int` | `countItems()` | Deprecated. As of JDK version 1.1, replaced by getItemCount(). |
| `void` | `delItem(int position)` | Deprecated. Replaced by remove(String) and remove(int). |
| `void` | `delItems(int start, int end)` | Deprecated. As of JDK version 1.1, Not for public use in the future. |
| `void` | `deselect(int index)` | Deselects the item at the specified index. |
| `AccessibleContext` | `getAccessibleContext()` | Gets the AccessibleContext associated with this List. |
| `ActionListener[]` | `getActionListeners()` | Returns an array of all the action listeners registered on this list. |
| `String` | `getItem(int index)` | Gets the item associated with the specified index. |
| `int` | `getItemCount()` | Gets the number of items in the list. |
| `ItemListener[]` | `getItemListeners()` | Returns an array of all the item listeners registered on this list. |
| `String[]` | `getItems()` | Gets the items in the list. |
| `<T extends EventListener> T[]` | `getListeners(Class<T> listenerType)` | Returns an array of all the objects currently registered as FooListeners upon this List. |
| `Dimension` | `getMinimumSize()` | Determines the minimum size of this scrolling list. |
| `Dimension` | `getMinimumSize(int rows)` | Gets the minimum dimensions for a list with the specified number of rows. |
| `Dimension` | `getPreferredSize()` | Gets the preferred size of this scrolling list. |
| `Dimension` | `getPreferredSize(int rows)` | Gets the preferred dimensions for a list with the specified number of rows. |
| `int` | `getRows()` | Gets the number of visible lines in this list. |
| `int` | `getSelectedIndex()` | Gets the index of the selected item on the list. |
| `int[]` | `getSelectedIndexes()` | Gets the selected indexes on the list. |
| `String` | `getSelectedItem()` | Gets the selected item on this scrolling list. |
| `String[]` | `getSelectedItems()` | Gets the selected items on this scrolling list. |
| `Object[]` | `getSelectedObjects()` | Gets the selected items on this scrolling list in an array of Objects. |
| `int` | `getVisibleIndex()` | Gets the index of the item that was last made visible by the method makeVisible. |
| `boolean` | `isIndexSelected(int index)` | Determines if the specified item in this scrolling list is selected. |
| `boolean` | `isMultipleMode()` | Determines whether this list allows multiple selections. |
| `boolean` | `isSelected(int index)` | Deprecated. As of JDK version 1.1, replaced by isIndexSelected(int). |
| `void` | `makeVisible(int index)` | Makes the item at the specified index visible. |
| `Dimension` | `minimumSize()` | Deprecated. As of JDK version 1.1, replaced by getMinimumSize(). |
| `Dimension` | `minimumSize(int rows)` | Deprecated. As of JDK version 1.1, replaced by getMinimumSize(int). |
| `protected String` | `paramString()` | Returns the parameter string representing the state of this scrolling list. |
| `Dimension` | `preferredSize()` | Deprecated. As of JDK version 1.1, replaced by getPreferredSize(). |
| `Dimension` | `preferredSize(int rows)` | Deprecated. As of JDK version 1.1, replaced by getPreferredSize(int). |
| `protected void` | `processActionEvent(ActionEvent e)` | Processes action events occurring on this component by dispatching them to any registered ActionListener objects. |
| `protected void` | `processEvent(AWTEvent e)` | Processes events on this scrolling list. |
| `protected void` | `processItemEvent(ItemEvent e)` | Processes item events occurring on this list by dispatching them to any registered ItemListener objects. |
| `void` | `remove(int position)` | Removes the item at the specified position from this scrolling list. |
| `void` | `remove(String item)` | Removes the first occurrence of an item from the list. |
| `void` | `removeActionListener(ActionListener l)` | Removes the specified action listener so that it no longer receives action events from this list. |
| `void` | `removeAll()` | Removes all items from this list. |
| `void` | `removeItemListener(ItemListener l)` | Removes the specified item listener so that it no longer receives item events from this list. |
| `void` | `removeNotify()` | Removes the peer for this list. |
| `void` | `replaceItem(String newValue, int index)` | Replaces the item at the specified index in the scrolling list with the new string. |
| `void` | `select(int index)` | Selects the item at the specified index in the scrolling list. |
| `void` | `setMultipleMode(boolean b)` | Sets the flag that determines whether this list allows multiple selections. |
| `void` | `setMultipleSelections(boolean b)` | Deprecated. As of JDK version 1.1, replaced by setMultipleMode(boolean). |


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
3. Using remove for Integer value
    ```java 
    List<lnteger> numbers = Arrays.asList(1, 2, 3, 4, 30);
    numbers.remove(30); // Will give IndexOutOfBoundException
    numbers.remove(Integer.valueOf(30)); // Will remove 30 from the ArrayList
    ```