package com.myitcompany.entities;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager extends Employee {
    private boolean IsPMPQualified;
    List<Project> AssignedProjects;

    public ProjectManager(String name, int id, int salary) {
        super(name, id, salary);
        AssignedProjects = new ArrayList<Project>();
    }

    public boolean isPMPQualified() {
        return IsPMPQualified;
    }

    public void setPMPQualified(boolean PMPQualified) {
        IsPMPQualified = PMPQualified;
    }

    public void AssignAProject(Project project)
    {
        AssignedProjects.add(project);
    }

    public void RemoveFromProject(Project project)
    {
        AssignedProjects.remove(project);
    }
}
