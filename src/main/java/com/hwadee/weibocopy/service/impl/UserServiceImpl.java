package com.hwadee.weibocopy.service.impl;

import javax.security.auth.login.LoginException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwadee.weibocopy.dao.UserDao;
import com.hwadee.weibocopy.entity.User;
import com.hwadee.weibocopy.service.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {
	private static final transient Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public User login(User user) throws LoginException {
		// TODO Auto-generated method stub
		log.info("{}偿试登录",user.getUsername());
		
		User us = userDao.findByUser(user.getUsername());
		
		if( us == null ){
			log.warn("{}登录失败,用户名或不存在", user.getUsername());
			throw new LoginException("用户名不存在!");
		} else if( ! user.getPassword().equals( us.getPassword() ) ){
			log.warn("{}登录失败,或密码错误", user.getUsername());
			throw new LoginException("密码错误!");
		}
		
		log.info("{}登录成功",user.getUsername());
		
		return us;
	}
	
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		
		userDao.insert(user);
	}
	
}
