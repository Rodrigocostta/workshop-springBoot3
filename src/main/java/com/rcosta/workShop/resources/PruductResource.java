package com.rcosta.workShop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcosta.workShop.entities.Product;
import com.rcosta.workShop.services.ProductService;

@RestController
@RequestMapping(value = "/product")
public class PruductResource {

	@Autowired
	private ProductService service;

	@GetMapping
	ResponseEntity<List<Product>> findall() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

	}

}
