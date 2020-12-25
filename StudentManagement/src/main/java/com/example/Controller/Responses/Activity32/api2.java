package com.example.Controller.Responses.Activity32;

import com.example.Model.Entities.Student;
import com.example.Model.Entities.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/prefix")
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "demo-student-list")
public class api2 {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Object getExampleStudentList(){
        List<Student> exampleStudentList = new ArrayList<>();
        Student student1 = new Student("Student1", "student1@gmail.com", 1);
        Student student2 = new Student("Student2", "student2@gmail.com", 2);
        Student student3 = new Student("Student3", "student3@gmail.com", 3);
        exampleStudentList.add(student1);
        exampleStudentList.add(student2);
        exampleStudentList.add(student3);
        return exampleStudentList;
    }

    @Autowired StudentExample demoStudentExample;

    @GetMapping(value = "/student2")
    public Object getExampleStudentList2(){
        return demoStudentExample.getStudentExampleList();
    }
}
