package com.example.studentdemo.service;

import com.example.studentdemo.dto.request.AddStudentRequest;
import com.example.studentdemo.dto.response.AddStudentResponse;
import com.example.studentdemo.exception.EmailAlreadyExistException;

public interface StudentService {
    AddStudentResponse addStudent(AddStudentRequest request) throws EmailAlreadyExistException;

}
