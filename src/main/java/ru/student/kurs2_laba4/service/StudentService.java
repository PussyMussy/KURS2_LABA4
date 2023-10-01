package ru.student.kurs2_laba4.service;


import org.springframework.stereotype.Service;
import ru.student.kurs2_laba4.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
