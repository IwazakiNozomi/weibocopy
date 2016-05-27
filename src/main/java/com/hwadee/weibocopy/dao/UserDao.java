package com.hwadee.weibocopy.dao;

import com.hwadee.weibocopy.entity.User;

public interface UserDao {
	User findByUser(String user);
	void insert( User user );
}
