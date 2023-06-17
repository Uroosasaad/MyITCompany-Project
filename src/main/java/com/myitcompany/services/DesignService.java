package com.myitcompany.services;

import com.myitcompany.Interfaces.Service;

public class DesignService implements Service {
    private String name;
    private double hours;
    private int id;

    public int getId() {
        return id;
    }

    public DesignService(String name, double hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    @Override
    public void doWork() {
        //System.out.println(this.name + " Will require " + this.hours);
        System.out.println("Service: " + this.name);
    }

    @Override
    public String getServiceName() {
        return this.getName();
    }

    @Override
    public int getServiceId() {
        return this.getId();
    }

    @Override
    public double getHourlyRate() {
        return this.hours;
    }
}
