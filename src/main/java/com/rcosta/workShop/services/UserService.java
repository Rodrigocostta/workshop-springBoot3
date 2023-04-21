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

	// inserindo um novo usuario
	public User insert(User obj) {
		return repository.save(obj);

	}

	// deletando um usuario
	public void delete(Long id) {
		repository.deleteById(id);
	}

	// atualizando um usuario

	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateDate(entity, obj);
		return repository.save(entity);
	}

	private void updateDate(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());

	}

}
