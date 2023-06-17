package com.myitcompany.services;

import com.myitcompany.Interfaces.Service;

public class DevelopmentService implements Service {
    private String name;
    private double hourlyRate;

    private int id;

    public DevelopmentService(String name, int id){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public DevelopmentService(String name, double hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getServiceName() {
        return this.getName();
    }
    @Override
    public int getServiceId() {
        return this.getId();
    }
    public double getPrice() {
        return this.hourlyRate * 100;
    }

    @Override
    public void doWork() {
        System.out.println(id+ ": " + this.name);
    }

    @Override
    public double getHourlyRate() {
        return this.hourlyRate;
    }
}
