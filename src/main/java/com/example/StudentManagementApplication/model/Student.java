package com.example.StudentManagementApplication.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String studentClass;

    @Column(nullable = false, unique = true)
    private Long phoneNumber;
}

