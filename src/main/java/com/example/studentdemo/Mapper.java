package com.example.studentdemo;

import com.example.studentdemo.dto.request.AddStudentRequest;
import com.example.studentdemo.dto.response.AddStudentResponse;
import com.example.studentdemo.model.data.Student;
import lombok.Builder;

@Builder
public class Mapper {
    public static void map(Student savedStudent, AddStudentResponse response) {
        response.setMessage("Welcome on board " + savedStudent.getFullName() + ". Your student id is " + savedStudent.getStudentId());
    }

    public static Student map(AddStudentRequest request) {
        Student student = Student.builder()
                .address(request.getAddress())
                .cohort(request.getCohort())
                .gender(request.getGender())
                .dob(request.getDob())
                .email(request.getEmail())
                .build();
        return student;
    }

    public static Student map2(AddStudentRequest request) {
        Student student = new Student();
        student.setAddress(request.getAddress());
        student.setCohort(request.getCohort());
        student.setGender(request.getGender());
        student.setDob(request.getDob());
        student.setEmail(request.getEmail());
        return student;
    }
}
