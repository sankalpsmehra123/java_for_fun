# Cloning
Every Collection, Map and its subclasses implements the `Cloneable` interface.
The `Object` class also provides the `clone()` method.

Cloning is used to create a copy of an object, which can be done as a shallow copy or a deep copy.

---

## Shallow vs. Deep Cloning

### The Analogy 💡
* **Shallow Cloning (Shared Keys):** Imagine you have a physical binder (the object) containing a key to a specific locker (a reference to a nested mutable object). When you make a shallow copy, you get a new binder, but inside it, you place a copy of the *same* locker key. If someone uses the key from the copied binder to open the locker and change its contents, the locker linked to the original binder is modified as well.
* **Deep Cloning (Full Duplication):** In a deep copy, you build a brand-new, identical locker, copy all the items from the original locker into it, and place the key to this *new* locker in the copied binder. Any changes made to the new locker do not affect the original locker at all.

---

### 1. Shallow Cloning

In shallow cloning, Java's default `Object.clone()` implementation is used. It creates a new instance of the class and copies all field values. 
* Primitive fields and immutable objects (like `String`) are copied by value.
* Nested mutable objects have their **reference (memory address)** copied. Thus, the original and cloned objects share references to the same nested objects.

#### Implementation Example:
```java
class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    String name;
    Address address; // Nested mutable object reference

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // super.clone() performs a shallow copy by default
        return super.clone(); 
    }
}
```

---

### 2. Deep Cloning

In deep cloning, we override the `clone()` method to not only copy the top-level object but also recursively clone all nested mutable objects. This breaks any shared reference between the original and the cloned object.

#### Implementation Example:
```java
class Person implements Cloneable {
    String name;
    Address address; // Nested mutable object reference

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Step 1: Perform a shallow copy for top-level fields
        Person cloned = (Person) super.clone();
        
        // Step 2: Explicitly clone the nested mutable object(s)
        if (this.address != null) {
            cloned.address = (Address) this.address.clone();
        }
        
        return cloned;
    }
}
```


