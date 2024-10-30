package com.example.praktikum_pbo.P_004.tugas;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Company {
    private String companyName;
    private List<Employee> employees;

    public Company(String companyName) {
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Company: ").append(companyName).append("\n");
        sb.append("Employees:\n");
        for (Employee employee : employees) {
            sb.append("  - ").append(employee).append("\n");
        }
        return sb.toString();
    }
}
