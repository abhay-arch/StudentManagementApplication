package com.example.StudentManagementApplication.exception;

public class ResourceNotFoundException extends RuntimeException  {
    public ResourceNotFoundException(String message){
        super(message);
    }
}
