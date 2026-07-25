package com.javaforfun.serialization;

import java.io.IOException;

import com.javaforfun.model.Employee;

public class RunningClass {
    public static void main(String[] args) {

        Employee employee = new Employee().setEmployeeId(1).setName("John").setPassword("hahahahaha");
        // null value is transfered in password serialization and deserialization,
        // because we have marked it as transient
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
