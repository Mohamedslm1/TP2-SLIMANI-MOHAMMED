package org.example;

import java.util.List;

public interface StudentService {
    void createStudent(Student student);
    Student findStudentById(int id);
    List<Student> getAllStudents();
    void displayStudent(Student student);
}
