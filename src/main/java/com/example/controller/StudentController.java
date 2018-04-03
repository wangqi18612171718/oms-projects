package com.example.controller;

import com.example.model.Student;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangqi on 18/4/2.
 */
@RestController
public class StudentController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello how are you ! ! !";
    }

    @RequestMapping("getUser")
    public String getUser(){
        Student student = userService.findById(1);
        System.out.println(student.getName());
        return "用户名:"+student.getName()+"用户ID:"+student.getId();
    }
}
