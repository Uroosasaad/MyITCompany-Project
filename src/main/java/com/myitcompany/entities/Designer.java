package com.myitcompany.entities;

import com.myitcompany.Interfaces.Documenting;

public class Designer extends Employee implements Documenting {
    public Designer(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void CreateDocumentation() {
        System.out.println("Create the Documentation");
    }
}
