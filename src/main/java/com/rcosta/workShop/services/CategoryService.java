package com.rcosta.workShop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.rcosta.workShop.entities.Category;
import com.rcosta.workShop.repositoryes.CategoryRepository;

@org.springframework.stereotype.Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();

	}
}
