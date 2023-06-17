package com.myitcompany.entities;

public abstract class Employee {
    private String name;
    private int id;
    private int salary;
    private Experience experience = Experience.JUNIOR;

    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }

    public Employee(String name, int id, int salary,Experience experience) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
