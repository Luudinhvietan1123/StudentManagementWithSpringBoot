package com.example.Controller.Responses.Activity32;

import com.example.Model.Entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/prefix")
public class api1 {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Object getExampleUser(){
        User newExampleUser = new User("Lưu Đình Việt Ân", "luudinhvietan1123@gmail.com");
        return newExampleUser.toString();
    }

    @GetMapping(value = "/user2")
    public Object getExampleUser2(){
        User newExampleUser = new User("Lưu Đình Việt Ân", "luudinhvietan1123@gmail.com");
        return newExampleUser.toString();
    }
}
