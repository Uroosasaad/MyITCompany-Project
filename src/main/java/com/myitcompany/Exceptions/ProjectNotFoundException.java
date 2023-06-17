package com.myitcompany.Exceptions;

public class ProjectNotFoundException extends Exception{

    public ProjectNotFoundException() {
        super("Not a valid project");
    }
    public ProjectNotFoundException(String message){
        super(message);
    }

    public ProjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
