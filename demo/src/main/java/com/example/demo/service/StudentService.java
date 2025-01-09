package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public StudentService() {
    }

    public List<Student> findAllStudents() {
        return List.of(
                Student.builder()
                        .name("Oleg")
                        .age(12)
                        .street("Heisterstrasse")
                        .build()
        );
    }
}
