package com.dl.project.service;

import com.dl.project.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List getUserDetails() {
        return userDao.getUserDetails();
    }
}