package com.example.studentdemo.model.data.enums;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public enum Gender {
    MALE("M"), FEMALE("F");

    private String name;

    Gender(String name) {
        this.name = name;
    }
}