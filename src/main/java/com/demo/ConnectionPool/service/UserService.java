/**
 * 
 */
package com.demo.ConnectionPool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ConnectionPool.entity.User;
import com.demo.ConnectionPool.repository.UserRepository;

/**
 * @author Aritra
 *
 */
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}

}
