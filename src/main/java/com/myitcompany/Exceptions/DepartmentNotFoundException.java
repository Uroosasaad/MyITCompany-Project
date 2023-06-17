package com.myitcompany.Exceptions;

public class DepartmentNotFoundException extends Exception {
    public DepartmentNotFoundException() {
        super("Department not found");
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }

    public DepartmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
