package com.example.cityexplorer.exception;

public class ForbiddenException extends RuntimeException {

    public ForbiddenException(String errorMessage) {
        super(errorMessage);
    }

}
