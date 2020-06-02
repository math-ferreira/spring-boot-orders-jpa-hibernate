package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.User;
import com.repository.UserRespository;

@Service
public class UserService {
	
	@Autowired
	private UserRespository userRespository;

	public List<User> findAllUsers(){
		return userRespository.findAll();
	}
	
	public User findUserById(Long id){
		return userRespository.findById(id).get();
	}
}
