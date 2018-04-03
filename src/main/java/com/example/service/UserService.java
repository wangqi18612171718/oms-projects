package com.example.service;

import com.example.model.Student;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangqi on 18/4/3.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Student findById(int id){
        return userRepository.findById(id);
    }
}
