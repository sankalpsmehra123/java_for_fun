# Serialization

Serialization is the process of converting the state of an object into a byte stream. This byte stream can then be saved to a file, stored in a database, or transmitted over a network.

Deserialization is the reverse process, where the byte stream is used to reconstruct the actual Java object in memory.

---

## The IKEA Wardrobe Analogy 📦

* **Serialization (Disassembly):** Imagine you have a fully assembled wooden wardrobe (the Java object in memory). You want to send this wardrobe to a friend in another city. Shipping it fully assembled is bulky and impractical. Instead, you disassemble the wardrobe, pack all the boards, screws, and layout instructions into a compact flat-pack box (the byte stream). Now it can be easily transported.
* **Deserialization (Reassembly):** Once the flat-pack box arrives at your friend's house, they open the box and follow the instructions to reassemble the wardrobe back into its original form (reconstructing the Java object in memory).
* **Transient Fields (Sticky Notes):** If you had temporary sticky notes with measurements stuck to the wardrobe, you wouldn't pack them in the box. You throw them away because they are temporary. In Java, fields marked with the `transient` keyword are skipped during serialization.

---

## How to Implement Serialization in Java

To make a Java class serializable, follow these steps:

1. **Implement `java.io.Serializable`**: This is a marker interface (an interface with no methods). It tells the JVM that the class is eligible for serialization.
2. **Define `serialVersionUID`**: A unique ID used during deserialization to verify that the sender and receiver of a serialized object have loaded classes that are compatible.
3. **Handle Nested Objects**: All nested custom objects within the class must also implement `Serializable`, or else a `NotSerializableException` will be thrown.
4. **Use `transient` for Ignored Fields**: Fields that you do not want to serialize (like passwords or temporary caches) should be marked with the `transient` keyword.

---

### Implementation Example

#### 1. The Serializable Class
```java
package com.javaforfun.model;

import java.io.Serializable;

public class Employee implements Serializable {
    // Unique identifier for class versioning
    private static final long serialVersionUID = 1L;

    private String name;
    private int employeeId;
    
    // This field will NOT be serialized
    transient private String password; 

    public Employee(String name, int employeeId, String password) {
        this.name = name;
        this.employeeId = employeeId;
        this.password = password;
    }

    // Getters and Setters ...
}
```

#### 2. Serialization (Writing the Object)
To serialize an object, wrap a stream (e.g., `FileOutputStream`) in an `ObjectOutputStream` and call `writeObject()`:

```java
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
    public static void serialize(Employee employee) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("employee.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(employee);
            System.out.println("Object has been serialized to employee.ser");
        }
    }
}
```

#### 3. Deserialization (Reading the Object)
To deserialize an object, wrap a source stream (e.g., `FileInputStream`) in an `ObjectInputStream` and call `readObject()`:

```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {
    public static Employee deserialize() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("employee.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            Employee employee = (Employee) ois.readObject();
            System.out.println("Object has been deserialized");
            return employee;
        }
    }
}
```