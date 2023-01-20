package com.cicd.cicdStudent.controller;

import com.cicd.cicdStudent.Dao.Student;
import com.cicd.cicdStudent.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDAO;

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentDAO.getStudent(id);
    }

    @GetMapping("/student/all")
    public List<Student> getAllStudents(){
        return studentDAO.getStudents();
    }
}
