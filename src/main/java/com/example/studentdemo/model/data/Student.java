package com.example.studentdemo.model.data;


import lombok.*;
import com.example.studentdemo.model.data.enums.Gender;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Getter
@Setter
@Entity
//@Table(name = "Student Data")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Student")
//@Data   this gives all the annotations in lombok
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String fullName;
    private Gender gender;
    @Email
    @Column(unique = true)
    private String email;
    private String address;
    private String cohort;
    private String studentId;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate dob;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate dateJoined = LocalDate.now();

}
