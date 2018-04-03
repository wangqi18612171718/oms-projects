package com.example.repository;

import com.example.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wangqi on 18/4/3.
 */
@Repository
public interface UserRepository extends CrudRepository<Student,Long> {

    Student findById(int id);

}
