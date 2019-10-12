package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.entities.User;
import com.zensar.services.UserService;
//request processer component (like pojo class)
@Controller
public class LoginController {
    @Autowired
	private UserService userService;
    @RequestMapping("login")
    public String checkLogin(User user,ModelMap map)
    {
    	if(userService.validateUser(user)) //if login is true then add into database in the form of key and value and welcome(logic view name)
    	{
    		map.addAttribute("usernm", user.getUsername());
    		return "welcome";
    	}
    	else
    	{
    		map.addAttribute("loginError", "Invalid username or password");
    		return "login";
    	}
    }
    
}
