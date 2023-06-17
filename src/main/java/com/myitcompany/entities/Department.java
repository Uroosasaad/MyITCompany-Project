package com.myitcompany.entities;

public class Department {
    private String name;
    private String Id;

    private String Location;

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Department(String name, String id, String location) {
        this.name = name;
        Id = id;
        this.Location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

}