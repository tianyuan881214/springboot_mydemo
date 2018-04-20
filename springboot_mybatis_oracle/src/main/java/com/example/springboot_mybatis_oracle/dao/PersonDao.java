package com.example.springboot_mybatis_oracle.dao;

import com.example.springboot_mybatis_oracle.model.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonDao {
    public Person findById(Long id);
    public List<Person> findAll();
}
