package com.example.model;

import javax.persistence.*;

/**
 * Created by wangqi on 18/4/3.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
