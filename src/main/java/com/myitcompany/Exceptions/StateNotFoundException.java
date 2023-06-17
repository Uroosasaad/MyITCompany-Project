package com.myitcompany.Exceptions;

public class StateNotFoundException extends Exception {

    public StateNotFoundException() {
        super("State Not Found!!");
    }
    public StateNotFoundException(String errorMessage) {
        super (errorMessage);
    }

    public StateNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
