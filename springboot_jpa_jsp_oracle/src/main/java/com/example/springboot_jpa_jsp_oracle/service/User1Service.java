package com.example.springboot_jpa_jsp_oracle.service;

import com.example.springboot_jpa_jsp_oracle.dao.User1Dao;
import com.example.springboot_jpa_jsp_oracle.model.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class User1Service {
    @Autowired
    private User1Dao user1Dao;

    public Userr findById(Long userId){
        return user1Dao.getOne(userId);
    }

    public List<Userr> findAll(){
        return user1Dao.findAll();
    }

}
