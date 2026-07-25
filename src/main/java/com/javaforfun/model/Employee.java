package com.javaforfun.model;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private int employeeId;
    transient private String password; // null value is transfered in serialization and deserialization

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Employee setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Employee setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", employeeId=" + employeeId + " password= " + password + "]";
    }
}
