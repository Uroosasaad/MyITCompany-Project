package com.myitcompany.entities;

public class QAEngineer extends Employee{
    private boolean IsCertified;

    public boolean isCertified() {
        return IsCertified;
    }

    public void setCertified(boolean certified) {
        IsCertified = certified;
    }

    public QAEngineer(String name, int id, int salary) {
        super(name, id, salary);
    }

}
