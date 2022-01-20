package com.company;

public class IllegalTriangleException extends Exception{
    private String errorMessage;

    public IllegalTriangleException(String e) {
        errorMessage = e;
    }

    public String getString(){
        return errorMessage;
    }
}
