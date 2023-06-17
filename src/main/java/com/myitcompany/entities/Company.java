package com.myitcompany.entities;

import com.myitcompany.Exceptions.DepartmentNotFoundException;
import com.myitcompany.Interfaces.Service;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private ArrayList<Department> departments;
    private ArrayList<Service> services;
    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<Department>();
        services = new ArrayList<>();
    }


    public Company() {
        departments = new ArrayList<Department>();
        services = new ArrayList<Service>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void AddDepartment(Department department){
        departments.add(department);
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }
    public void AddService(Service service){
        services.add(service);
    }

    public ArrayList<Service> GetAllServices()
    {
        return services;
    }
    public Boolean checkIfDepartmentExists(String departmentName) throws DepartmentNotFoundException {
        if (departments == null && departments.size() > 0
                && departments.stream().anyMatch(x-> x.getName() == departmentName)) {
            return true;
        }
        else {
            throw new DepartmentNotFoundException();
        }
    }
}
