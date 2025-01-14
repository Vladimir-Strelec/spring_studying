package com.example.demo.impl;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplMemoryStudentsService implements StudentService {
    @Override
    public List<Student> findAllStudents() {
        return List.of(
                Student.builder().name("Service is Interface").age(13).street("poh").build()
        );
    }
}
