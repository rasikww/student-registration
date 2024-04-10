package org.example.demo.controller;

import org.example.demo.dto.Student;
import org.example.demo.service.StudentService;
import org.example.demo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService service;
    @PostMapping("/student")
    Student receiveStudent(@RequestBody Student student){
        return service.createStudent(student);
    }
}
