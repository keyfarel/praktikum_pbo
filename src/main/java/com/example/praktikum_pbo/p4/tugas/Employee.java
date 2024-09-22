package com.example.praktikum_pbo.p4.tugas;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee extends Person {
    private String employeeId;
    private String department;

    public Employee(String name, int age,
                    String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [ID: " + employeeId
                + ", Department: "
                + department + ", Name: " + getName()
                + ", Age: " + getAge()
                + "]";
    }
}
