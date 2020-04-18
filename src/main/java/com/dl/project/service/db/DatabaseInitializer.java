package com.dl.project.service.db;

import com.dl.project.dao.DetailsDao;
import com.dl.project.dao.UserDao;
import com.dl.project.domain.UserDetails;
import com.dl.project.domain.RawDatabaseDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Service
public class DatabaseInitializer {

    @Autowired
    UserDao userDao;
    @Autowired
    DetailsDao detailsDao;
//    AttributeDao attributeDao;

    @PostConstruct
    public void init(){
        userDao.persist(UserDetails.builder().firstName("dom").lastName("smi").email("domemail").password("pass").build());
        userDao.persist(UserDetails.builder().firstName("luk").lastName("pra").email("lukemail").password("lukkpass").build());
        detailsDao.persist(RawDatabaseDetail.builder().id(UUID.randomUUID()).name("FIRST_NAME").parentId(UUID.randomUUID()).value("Lukasz").build());
    }
}
