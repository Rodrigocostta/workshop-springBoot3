package com.rcosta.workShop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.rcosta.workShop.entities.User;
import com.rcosta.workShop.repositoryes.UserRepository;

@org.springframework.stereotype.Service
public class UserService {

	/* Listando todos */
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();

	}

	/* Buscando com parametro */
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

	public User insert(User obj) {
		return repository.save(obj);

	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
