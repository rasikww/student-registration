package org.example.demo.dto;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer studentId;
    private String firstName;
    private String lastName;
    private String address;
    private int age;
}
