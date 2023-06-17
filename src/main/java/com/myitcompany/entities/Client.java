package com.myitcompany.entities;


import com.myitcompany.Exceptions.InsufficientProjectFundingException;
import com.myitcompany.Exceptions.ProjectNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String email;
    private String registeredState;
    protected List<Project> projects;

    public Client(String name, String email,String regState){
        this.name = name;
        this.email = email;
        this.registeredState = regState;
        this.projects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Project> getProjects() throws ProjectNotFoundException {

        if(projects == null || projects.size() < 1) throw new ProjectNotFoundException();

        return projects;
    }

    public void addProject (Project projects) {
        this.projects.add(projects);
    }

    public double calculateProjectCost(){
        double totalCost = 0;
        for (Project project : projects){
            try {
                totalCost += project.getProjectCost();
            } catch (InsufficientProjectFundingException e) {
                System.out.println(e.toString());
            }
        }
        return totalCost;
    }

}
