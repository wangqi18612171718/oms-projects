package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangqi on 18/4/2.
 */
@RestController
public class testController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello how are you ! ! !";
    }
}
