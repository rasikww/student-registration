package org.example.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.demo.dto.Student;
import org.example.demo.dto.StudentEntity;
import org.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository repository;
    @Autowired
    ObjectMapper mapper;
    public Student createStudent(Student student){
//        System.out.println(student);
        StudentEntity studentEntity = mapper.convertValue(student, StudentEntity.class);
        StudentEntity savedStudentEntity = repository.save(studentEntity);
        return mapper.convertValue(savedStudentEntity, Student.class);
    }
}
