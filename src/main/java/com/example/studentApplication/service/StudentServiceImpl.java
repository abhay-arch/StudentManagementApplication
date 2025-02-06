package com.example.studentApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.example.studentApplication.dto.StudentDTO;
import com.example.studentApplication.exception.ResourceNotFoundException;
import com.example.studentApplication.model.Student;
import com.example.studentApplication.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    @CacheEvict(value = "students", allEntries = true)
    public Student addStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setAge(studentDTO.getAge());
        student.setStudentClass(studentDTO.getStudentClass());;
        student.setPhoneNumber(studentDTO.getPhoneNumber());
        return studentRepository.save(student);
    }

    @Override
    @CacheEvict(value = "students", allEntries = true)
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> searchStudentByName(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    @CacheEvict(value = "students", allEntries = true)
    public Student updateStudent(Long id, StudentDTO studentDTO) {
        Student student = studentRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Student not found with ID: " + id));
        student.setName(studentDTO.getName());
        student.setAge(studentDTO.getAge());
        student.setStudentClass(studentDTO.getStudentClass());;
        student.setPhoneNumber(studentDTO.getPhoneNumber());
        return studentRepository.save(student);
    }

    @Override
    @CacheEvict(value = "students", allEntries = true)
    public void deleteStudent(Long id) {
       if(!studentRepository.existsById(id)){
        throw new ResourceNotFoundException("Student not found with ID: " + id);
       }
       studentRepository.deleteById(id);
    }
}
