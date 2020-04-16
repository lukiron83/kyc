package com.dl.project.service.db;

import com.dl.project.dao.UserDao;
import com.dl.project.domain.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DatabaseInitializer {

    @Autowired
    UserDao userDao;

    @PostConstruct
    public void init(){
        userDao.persist(UserDetails.builder().firstName("dom").lastName("smi").email("domemail").password("pass").build());
        userDao.persist(UserDetails.builder().firstName("luk").lastName("pra").email("lukemail").password("lukkpass").build());

    }
}
