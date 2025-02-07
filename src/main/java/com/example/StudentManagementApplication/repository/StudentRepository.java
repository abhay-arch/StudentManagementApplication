package com.example.StudentManagementApplication.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementApplication.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByNameContainingIgnoreCase(String name);
}
