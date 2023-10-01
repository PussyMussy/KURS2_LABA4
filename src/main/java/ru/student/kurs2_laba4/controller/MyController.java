package ru.student.kurs2_laba4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.student.kurs2_laba4.entity.Student;
import ru.student.kurs2_laba4.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> showAllStudents(){
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;

    }


    @GetMapping("/students/{id}")
    public Student getStudent (@PathVariable("id") int id) { return studentService.getStudent(id);}

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) { return studentService.saveStudent(student);}

    @PostMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public void updateStudent(@PathVariable("id") int id) { studentService.deleteStudent(id);}

}
