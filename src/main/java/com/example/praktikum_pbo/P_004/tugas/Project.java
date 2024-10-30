package com.example.praktikum_pbo.P_004.tugas;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Project {
    private String projectName;
    private List<Employee> teamMembers;

    public Project(String projectName) {
        this.projectName = projectName;
        this.teamMembers = new ArrayList<>();
    }

    public void addTeamMember(Employee employee) {
        teamMembers.add(employee);
    }

    public void removeTeamMember(Employee employee) {
        teamMembers.remove(employee);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Project: ").append(projectName).append("\n");
        sb.append("Team Members:\n");
        for (Employee employee : teamMembers) {
            sb.append("  - ").append(employee).append("\n");
        }
        return sb.toString();
    }
}
