package com.example.StudentManagementApplication.service;

import java.util.List;

import com.example.StudentManagementApplication.dto.StudentDTO;
import com.example.StudentManagementApplication.model.Student;

public interface StudentService {
    Student addStudent(StudentDTO studentDTO);
    List<Student> getAllStudents();
    List<Student> searchStudentByName(String name);
    Student updateStudent(Long id, StudentDTO studentDTO);
    void deleteStudent(Long id);
}
