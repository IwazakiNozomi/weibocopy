package com.hwadee.weibocopy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hwadee.weibocopy.entity.User;
import com.hwadee.weibocopy.service.interfaces.UserService;

@Controller
public class LoginCotroller {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(User user, HttpSession session)
	{
		
		try {
			
			user = userService.login(user);
			
			session.setAttribute("user", user);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "NewFile";
	}
	
	@RequestMapping("/reg")
	public String reg(User user, HttpSession session)
	{
		
		try {
			
			userService.insert(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//res.sendRedirect(arg0);
		return "NewFile";
	}
}
