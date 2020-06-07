package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Category;
import com.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRespository;

	public List<Category> findAllUsers() {
		return categoryRespository.findAll();
	}

	public Category findUserById(Long id) {
		return categoryRespository.findById(id).get();
	}

}
