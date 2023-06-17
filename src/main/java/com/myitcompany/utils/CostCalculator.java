package com.myitcompany.utils;

import com.myitcompany.Exceptions.InsufficientProjectFundingException;
import com.myitcompany.entities.Project;

import java.util.List;

public class CostCalculator {
    public static double MINIMUM_PROJECT_COST = 100;
    public static double MINIMUM_PROJECT_HOURS = 400;
    public static double MAXIMUM_PROJECT_HOURS = 500;
    public static double calculateCost(List<Project> projectList) {
        double totalCost = 0;

        for (Project project : projectList) {

            try {
                totalCost += project.getProjectCost();
            } catch (InsufficientProjectFundingException e) {
                System.out.println(e.toString());
            }
        }
        return totalCost;
    }
}