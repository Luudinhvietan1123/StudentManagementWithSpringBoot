package com.example.Model.Entities;

import lombok.Data;

@Data
public class Student {
    private String studentName;
    private String studentEmail;
    private int studentId;

    public Student(String studentName, String studentEmail, int studentId) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
