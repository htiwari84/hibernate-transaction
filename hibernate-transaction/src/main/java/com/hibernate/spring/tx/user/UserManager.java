package com.hibernate.spring.tx.user;

import java.util.List;

import com.hibernate.spring.tx.model.User;

public interface UserManager {

	void insertUser(User user);
	
	User getUserById(int userId);
	
	User getUser(String username);
	
	List<User> getUsers();
}
