package com.javaforfun.serialization;

import com.javaforfun.model.Employee;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {

    public static Employee deserialization() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("employee.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee employee = (Employee) ois.readObject();
        ois.close();
        fis.close();
        return employee;
    }
}
