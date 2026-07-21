package com.javaforfun.collection.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.javaforfun.model.Employee;

public class SerializationTest {
    public static void serialization(Employee employee) throws IOException{
        FileOutputStream fos = new FileOutputStream("employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employee);
        oos.close();
        fos.close();
    }
}
