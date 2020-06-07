package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Order;
import com.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRespository;

	public List<Order> findAllUsers(){
		return orderRespository.findAll();
	}
	
	public Order findUserById(Long id){
		return orderRespository.findById(id).get();
	}
}
