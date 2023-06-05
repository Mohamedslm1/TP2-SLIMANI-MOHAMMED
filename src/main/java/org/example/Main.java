package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
public class Main {
        public static void main(String[] args) {
            // Crée le contexte Spring en utilisant la configuration définie dans ApplicationConfig
            ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

            // Récupère le bean StudentService à partir du contexte
            StudentService studentService = context.getBean(StudentService.class);

            // Utilise les méthodes du StudentService
            Student student1 = new Student(1, "Slimani", "Mohammed", 23);
            studentService.createStudent(student1);

            Student student2 = studentService.findStudentById(1);
            System.out.println(student2);

            List<Student> students = studentService.getAllStudents();
            for (Student student : students) {
                studentService.displayStudent(student);
            }
        }
}