package com.example.Model.Entities;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "demo-student-list")
public class StudentExample {
    private String studentName;
    private String studentEmail;
    private int studentId;
    private List<StudentExample> studentExampleList;

    @Override
    public String toString() {
        return "StudentExample{" +
                "studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
