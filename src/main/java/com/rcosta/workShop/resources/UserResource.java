package com.rcosta.workShop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcosta.workShop.entities.User;
import com.rcosta.workShop.services.Service;

/*Essa é uma classe de serviços */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private Service service;

	@GetMapping
	ResponseEntity<List<User>> findall() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value ="/{id}")
	ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

				
	}

}