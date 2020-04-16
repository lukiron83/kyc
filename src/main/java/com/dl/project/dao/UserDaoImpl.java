package com.dl.project.dao;

import com.dl.project.domain.UserDetails;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getUserDetails() {
        Criteria criteria;
        criteria = entityManager.unwrap(Session.class).createCriteria(UserDetails.class);
        return criteria.list();
    }
}