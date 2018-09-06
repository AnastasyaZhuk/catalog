package com.catalog.service;

import com.catalog.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
