package com.myitcompany.services;

import com.myitcompany.Interfaces.QualityAssurance;
import com.myitcompany.Interfaces.Service;

public class QAService implements Service, QualityAssurance {
    private String name;
    private double hourlyRate;
    private int id;

    public QAService(String name , int id){
        this.name = name;
        this.id = id;
    }
    public QAService(String name, double hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getServiceName() {
        return this.getName();
    }

    public int getId() {
        return id;
    }

    @Override
    public int getServiceId() {
        return this.getId();
    }
    @Override
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public void doWork(){

        System.out.println(id+ ": " + this.name);
    }

    @Override
    public void Test() {
        System.out.println("create Test Cases");
    }
}
