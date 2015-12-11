/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arash.services;

import com.arash.entities.*;
import java.util.*;

/**
 *
 * @author Arash
 */
public interface UserService {
    public List<User> findAll();
    public User find(String username);
    public void create(User user);
    public void edit(User user);
    public void delete(User user);
}
