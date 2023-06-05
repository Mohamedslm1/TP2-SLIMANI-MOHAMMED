package org.example;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStudentRepository implements StudentRepository {
    private List<Student> students = new ArrayList<>();

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public Student findById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }
}
