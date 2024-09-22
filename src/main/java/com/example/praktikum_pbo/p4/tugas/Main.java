package com.example.praktikum_pbo.p4.tugas;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 30, "E001", "Engineering");
        Employee emp2 = new Employee("Jane Smith", 28, "E002", "Marketing");
        Employee emp3 = new Employee("Alice Johnson", 35, "E003", "Finance");

        Company company = new Company("Tech Innovators");
        company.addEmployee(emp1);
        company.addEmployee(emp2);
        company.addEmployee(emp3);

        Project project = new Project("Project Alpha");
        project.addTeamMember(emp1);
        project.addTeamMember(emp3);

        System.out.println(company);
        System.out.println(project);
    }
}
