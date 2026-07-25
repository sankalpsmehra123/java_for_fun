package com.javaforfun.cloning;

class DeepAddress implements Cloneable {
    String city;

    DeepAddress(String city) {
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

class DeepPerson implements Cloneable {
    String name;
    DeepAddress address;

    DeepPerson(String name, DeepAddress address) {
        this.name = name;
        this.address = address;
    }

    // Implementing deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepPerson clonedPerson = (DeepPerson) super.clone();
        // Deep copy the nested mutable object
        clonedPerson.address = (DeepAddress) this.address.clone();
        return clonedPerson;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}

public class CloneEx2 {
    public static void main(String[] args) {
        // Deep Copy
        // When we deep clone an object, we copy the object itself along with any
        // nested mutable objects it references. Changes to the original nested
        // objects will not affect the cloned object's nested objects.
        try {
            DeepAddress address = new DeepAddress("New York");
            DeepPerson person1 = new DeepPerson("John", address);

            // Perform deep copy
            DeepPerson person2 = (DeepPerson) person1.clone();

            System.out.println("Before modification:");
            System.out.println("Person 1: " + person1);
            System.out.println("Person 2: " + person2);

            // Modifying the address in the original person
            person1.address.city = "Los Angeles";

            System.out.println("\nAfter modifying Person 1's city to 'Los Angeles':");
            System.out.println("Person 1: " + person1);
            System.out.println("Person 2: " + person2); // Person 2's city remains "New York"
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
