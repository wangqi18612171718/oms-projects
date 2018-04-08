package com.example.controller;

import com.example.model.Student;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangqi on 18/4/2.
 */
@Controller
public class StudentController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String hello(Model model){
        System.out.print("fsa");
        model.addAttribute("test","测试一下看看");
        return "views/index";
    }

    @RequestMapping("getUser")
    public String getUser(Model model){
        Student student = userService.findById(1);
        model.addAttribute("Name",student.getName());
        model.addAttribute("Id",student.getId());
        return "views/index";
    }
}
