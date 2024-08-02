package com.spring.registration.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.registration.application.model.User;


public interface UserRepository extends JpaRepository<User, Long>{

	Object findByEmail(String email);

	User findByUsername(String username);
	
	

}
