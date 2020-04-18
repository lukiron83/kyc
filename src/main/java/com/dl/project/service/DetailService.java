package com.dl.project.service;

import com.dl.project.dao.DetailsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {
    @Autowired
    DetailsDao detailsDao;
    public List getAllDetails(){
        return detailsDao.getAllDetails();
    }
}
