package ru.student.kurs2_laba4.service;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.student.kurs2_laba4.dao.StudentDAO;
import ru.student.kurs2_laba4.entity.Student;

import java.util.List;

@Service
public class StudentServicelmpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }


    @Override
    @Transactional
    public Student getStudent(int id) {return  studentDAO.getStudent(id);}

    @Override
    @Transactional


    public  Student saveStudent(Student student) {
        return studentDAO.saveStudent(student);
    }


    @Override
    @Transactional
    public  void deleteStudent(int id) {studentDAO.deleteStudent(id);}
}
