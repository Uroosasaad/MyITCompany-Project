package com.myitcompany.Exceptions;

public class InsufficientProjectFundingException extends Exception{

    public InsufficientProjectFundingException() {
        super("Project costing does not meet minimum cost criteria!");
    }

    public InsufficientProjectFundingException(String message){
        super(message);
    }

    public InsufficientProjectFundingException(String message, Throwable cause) {
        super(message, cause);
    }
}
