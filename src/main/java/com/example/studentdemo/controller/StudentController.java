package com.example.studentdemo.controller;

import com.example.studentdemo.dto.request.AddStudentRequest;
import com.example.studentdemo.dto.response.AddStudentResponse;
import com.example.studentdemo.exception.EmailAlreadyExistException;
import com.example.studentdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentdemo")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public AddStudentResponse addStudent(@RequestBody AddStudentRequest request) throws EmailAlreadyExistException {
        return studentService.addStudent(request);
    }

}
