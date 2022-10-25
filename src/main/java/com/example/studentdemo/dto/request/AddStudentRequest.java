package com.example.studentdemo.dto.request;

import com.example.studentdemo.model.data.enums.Gender;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddStudentRequest {
    private String fullName;
    private Gender gender;
    @Email
    @Column(unique = true)
    private String email;
    private String address;
    private String cohort;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate dob;

}
