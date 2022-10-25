package com.example.studentdemo.exception;

public class EmailAlreadyExistException extends StudentDemoException {
    public EmailAlreadyExistException(String message) {
        super(message);
    }
}
