package com.hwadee.weibocopy.service.interfaces;

import javax.security.auth.login.LoginException;

import com.hwadee.weibocopy.entity.User;

public interface UserService {
	//用户登陆
	User login(User user) throws LoginException;
	
	//新添用户
	void insert(User user);
}
