package com.example.carrental.exception;

public class InvalidClientDataException extends RuntimeException {

    public InvalidClientDataException(String errorMessage) {
        super("Client creation failed: " + errorMessage);
    }

}
