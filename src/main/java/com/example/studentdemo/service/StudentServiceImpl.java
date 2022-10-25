package com.example.studentdemo.service;

import com.example.studentdemo.Mapper;
import com.example.studentdemo.dto.request.AddStudentRequest;
import com.example.studentdemo.dto.response.AddStudentResponse;
import com.example.studentdemo.exception.EmailAlreadyExistException;
import com.example.studentdemo.model.data.Student;
import com.example.studentdemo.model.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.UUIDEditor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private  StudentRepository studentRepository;
    @Override
    public AddStudentResponse addStudent(AddStudentRequest request) throws EmailAlreadyExistException {
        if (studentRepository.existsByEmail(request.getEmail())) throw new EmailAlreadyExistException("Email already exist");
        Student student = Student.builder()
                .address(request.getAddress())
                .cohort(request.getCohort())
                .gender(request.getGender())
                .dob(request.getDob())
                .email(request.getEmail())
                .build();
        String studentId = String.valueOf(UUID.randomUUID().getMostSignificantBits());
        studentId = "ST" + studentId.substring(1,4);
        student.setStudentId(studentId);

        if (studentRepository.existsByStudentId(student.getStudentId())){
            String newStudentId;
            newStudentId = "ST" + studentId.substring(1,4);
            student.setStudentId(newStudentId);
        }
        Student savedStudent = studentRepository.save(student);
        AddStudentResponse response = new AddStudentResponse();
        Mapper.map(savedStudent,response);
        return response;

        
    }


}
