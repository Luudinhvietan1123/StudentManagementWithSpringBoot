package com.example.Model.Entities;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "demo-user")
public class UserExample {
    private String userName;
    private String userEmail;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + userEmail + '\'' +
                '}';
    }
}
