package ru.student.kurs2_laba4.dao;

import org.springframework.stereotype.Repository;
import ru.student.kurs2_laba4.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
