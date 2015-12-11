/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arash.dao;

import com.arash.entities.*;
import java.util.*;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

/**
 *
 * @author Arash
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    @Override
    public List<User> findAll() {
        
        return sessionFactory.getCurrentSession().createCriteria(User.class).list();
    }

    @Override
    public User find(String username) {
        return  (User) sessionFactory.getCurrentSession().createCriteria(User.class)
                .add(Restrictions.eq("username", username));
    }

    @Override
    public void create(User user) {
        try {
            sessionFactory.getCurrentSession().persist(user);
        } catch (Exception e) {
            throw e;
        }
        
    }

    @Override
    public void edit(User user) {
        try {
            sessionFactory.getCurrentSession().merge(user);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(User user) {
        try {
            sessionFactory.getCurrentSession().delete(user);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
