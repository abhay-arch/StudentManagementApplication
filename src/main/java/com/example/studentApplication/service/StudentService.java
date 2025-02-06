package com.example.studentApplication.service;

import java.util.List;

import com.example.studentApplication.dto.StudentDTO;
import com.example.studentApplication.model.Student;

public interface StudentService {
    Student addStudent(StudentDTO studentDTO);
    List<Student> getAllStudents();
    List<Student> searchStudentByName(String name);
    Student updateStudent(Long id, StudentDTO studentDTO);
    void deleteStudent(Long id);
}
