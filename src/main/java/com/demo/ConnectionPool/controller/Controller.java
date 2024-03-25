/**
 * 
 */
package com.demo.ConnectionPool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ConnectionPool.entity.User;
import com.demo.ConnectionPool.service.UserService;


/**
 * @author Aritra
 *
 */
@RestController
@RequestMapping(value ="/api")
public class Controller {
	
	@Autowired
	UserService service;
	
	@GetMapping(value="/v1/users/getUsers")
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<User>>(service.getAllUsers(),HttpStatus.OK);
	}
	
	@GetMapping(value="/check")
	public ResponseEntity <?> check(){
		return new ResponseEntity<String>("Server is Up and Running!",HttpStatus.OK);
	}

}
