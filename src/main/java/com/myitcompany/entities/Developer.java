package com.myitcompany.entities;

import com.myitcompany.Interfaces.Documenting;
import com.myitcompany.Interfaces.Technical;

public class Developer extends Employee implements Documenting, Technical {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void CreateDocumentation() {
        System.out.println("Create the Documentation");
    }

    @Override
    public void Code() {
        System.out.println("Program Code");
    }
}
