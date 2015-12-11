/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arash.controller;

import com.arash.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Arash
 */

@Controller
//@RequestMapping(value = "user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    ApplicationContext applicationContext;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        
        modelMap.put("listUsers", userService.findAll());
        return "index";
    }
    
    
    
}
