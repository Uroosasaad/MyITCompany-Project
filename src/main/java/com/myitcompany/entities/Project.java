package com.myitcompany.entities;

import com.myitcompany.utils.CostCalculator;
import com.myitcompany.Exceptions.InsufficientProjectFundingException;

public class Project {
    private int projectId;
    private final String projectName;
    private double projectPerHourCost;
    private double projectTotalHours;

    private boolean isCompleted;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public double getProjectPerHourCost() {
        return projectPerHourCost;
    }

    public void setProjectPerHourCost(float projectPerHourCost) {
        this.projectPerHourCost = projectPerHourCost;
    }

    public double getProjectTotalHours() {
        return projectTotalHours;
    }

    public void setProjectTotalHours(double projectTotalHours) {
        this.projectTotalHours = projectTotalHours;
    }
    public double getProjectCost() throws InsufficientProjectFundingException {
        double projCost = (projectTotalHours * projectPerHourCost);

        if (projCost < CostCalculator.MINIMUM_PROJECT_COST){
            throw new InsufficientProjectFundingException();
        }

        return projCost;
    }
 }