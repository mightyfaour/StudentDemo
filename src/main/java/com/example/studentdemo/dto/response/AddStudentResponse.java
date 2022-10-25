package com.example.studentdemo.dto.response;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddStudentResponse {
    private String message;
    private String studentId;
}
