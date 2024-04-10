package org.example.demo.repository;

import org.example.demo.dto.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,Integer> {
}
