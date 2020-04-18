package com.dl.project.dao;

import com.dl.project.domain.RawDatabaseDetail;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DetailsDao {
    @PersistenceContext
    private EntityManager entityManager;

    public List getAllDetails() {
        Criteria criteria;
        criteria = entityManager.unwrap(Session.class).createCriteria(RawDatabaseDetail.class);
        return criteria.list();
    }

    @Transactional
    public  void persist(RawDatabaseDetail rawDatabaseDetail){
        entityManager.persist(rawDatabaseDetail);
    }
}
