/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arash.services;

import com.arash.dao.UserDao;
import com.arash.dao.UserDaoImpl;
import com.arash.entities.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Arash
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User find(String username) {
        return userDao.find(username);
    }

    @Override
    public void create(User user) {
        try {
            userDao.create(user);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void edit(User user) {
        try {
            userDao.edit(user);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void delete(User user) {
        try {
            userDao.delete(user);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
