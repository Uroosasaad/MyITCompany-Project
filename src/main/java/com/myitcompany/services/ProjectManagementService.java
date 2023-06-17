package com.myitcompany.services;

import com.myitcompany.Interfaces.Service;

public class ProjectManagementService implements Service {
    private String name;
    private double hourlyRate;
    private int id;

    public ProjectManagementService(String name ,int id){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public ProjectManagementService(String name, double hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;

    }
    @Override
    public int getServiceId() {
        return this.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    public double getPrice() {
        return hourlyRate * 50;
    }

    @Override
    public void doWork() {
        System.out.println(id+ ": " + this.name);
    }

    @Override
    public String getServiceName() {
        return this.getName();
    }
}
