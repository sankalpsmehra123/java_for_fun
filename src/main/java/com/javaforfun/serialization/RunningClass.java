package com.javaforfun.serialization;

import java.io.IOException;

import com.javaforfun.model.Employee;

public class RunningClass {
    public static void main(String[] args) {

        Employee employee = new Employee().setEmployeeId(1).setName("John");
        try {
            SerializationTest.serialization(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Employee deserializedEmployee = DeserializationTest.deserialization();
            System.out.println("deserializedEmployee: " + deserializedEmployee.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
