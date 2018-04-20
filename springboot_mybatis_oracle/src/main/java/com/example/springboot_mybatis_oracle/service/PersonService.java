package com.example.springboot_mybatis_oracle.service;

import com.example.springboot_mybatis_oracle.dao.PersonDao;
import com.example.springboot_mybatis_oracle.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public Person findById(Long id){
        return personDao.findById(id);
    }

    public List<Person> findAll(){
        return personDao.findAll();
    }

}
