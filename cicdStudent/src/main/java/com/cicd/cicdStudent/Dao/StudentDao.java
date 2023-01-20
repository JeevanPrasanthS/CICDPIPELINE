package com.cicd.cicdStudent.Dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDao {

    List<Student>  list=new ArrayList<>();


    public StudentDao(){

        list.add(new Student(112,"Hari","10th",550));
        list.add(new Student(132,"Sri","8th",590));
        list.add(new Student(147,"Kiran","6th",520));

    }

    public Student getStudent(int id) {
        for (Student student : list) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudents() {
        return list;
    }
}
