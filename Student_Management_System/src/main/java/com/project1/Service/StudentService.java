package com.project1.Service;

import com.project1.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student updateStudent(Student student);
    Student getStudentById(Long id);

    void deletedStudentById(Long id);
}
