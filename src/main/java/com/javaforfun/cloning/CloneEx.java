package com.javaforfun.cloning;

class ShallowAddress implements Cloneable {
    String city;

    ShallowAddress(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return city;
    }
}

class ShallowPerson implements Cloneable {
    String name;
    ShallowAddress address;

    ShallowPerson(String name, ShallowAddress address) {
        this.name = name;
        this.address = address;
    }

    // Implementing shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // super.clone() performs a shallow copy by default, copying field values
        // (including references to nested objects without cloning them).
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}

public class CloneEx {
    public static void main(String[] args) {
        // Shallow Copy
        // When we clone an object using a shallow copy, the new object has a copy of
        // the primitive fields and object reference variables of the original object.
        // Nested mutable objects are NOT cloned; their references are shared.
        try {
            ShallowAddress address = new ShallowAddress("New York");
            ShallowPerson person1 = new ShallowPerson("John", address);

            // Perform shallow copy
            ShallowPerson person2 = (ShallowPerson) person1.clone();

            System.out.println("Before modification:");
            System.out.println("Person 1: " + person1);
            System.out.println("Person 2: " + person2);

            // Modifying the address in the original person
            person1.address.city = "Los Angeles";

            System.out.println("\nAfter modifying Person 1's city to 'Los Angeles':");
            System.out.println("Person 1: " + person1);
            System.out.println("Person 2: " + person2); // Person 2's city will also change to "Los Angeles"
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
