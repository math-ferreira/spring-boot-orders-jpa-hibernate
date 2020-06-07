package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRespository;

	public List<Product> findAllUsers() {
		return productRespository.findAll();
	}

	public Product findUserById(Long id) {
		return productRespository.findById(id).get();
	}

}
