package com.example;

import com.example.Model.Entities.StudentExample;
import com.example.Model.Entities.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties
public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	UserExample demoUserExample;

	@Autowired
	StudentExample demoStudentExample;

	@Override
	public void run(String...args) throws Exception{
		System.out.println("Global variable: ");
		System.out.println("\tUser name: " + demoUserExample.getUserName());
		System.out.println("\tUserEmail: " + demoUserExample.getUserEmail());
		System.out.println("\tDemo student list: " + demoStudentExample.getStudentExampleList());
	}
}
