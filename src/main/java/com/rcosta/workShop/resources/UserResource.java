package com.rcosta.workShop.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcosta.workShop.entities.User;


/*Essa é uma classe de serviços */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	ResponseEntity<User> findall() {
		User u = new User(1L, "ze", "ze@Gmail", "4578965", "123");
		return ResponseEntity.ok().body(u);

	}

}