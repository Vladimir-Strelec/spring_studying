package com.example.demo.controler;

import com.example.demo.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v.1/students")
public class StudentsController {

    @GetMapping
    public List<Student> studentList() {
        return List.of(
                Student.builder()
                        .name("Oleg")
                        .age(12)
                        .street("Heisterstrasse")
                        .build()
        );
    }
}
