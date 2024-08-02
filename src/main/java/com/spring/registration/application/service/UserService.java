package com.spring.registration.application.service;

import com.spring.registration.application.model.User;

public interface UserService {
	
	User saveUser(User user);
    User findUserById(Long id);
	User findByUsername(String username);

}
