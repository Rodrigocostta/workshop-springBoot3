package com.rcosta.workShop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcosta.workShop.entities.Category;
import com.rcosta.workShop.services.CategoryService;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {

	@Autowired
	private CategoryService service;

	@GetMapping
	ResponseEntity<List<Category>> findAll() {

		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

	}

}
