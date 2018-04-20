package com.example.springboot_jpa_jsp_oracle.dao;

import com.example.springboot_jpa_jsp_oracle.model.Userr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface User1Dao extends JpaRepository<Userr,Long>,JpaSpecificationExecutor<Userr> {
}
