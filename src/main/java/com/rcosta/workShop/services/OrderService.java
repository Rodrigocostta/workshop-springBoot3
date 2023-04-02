package com.rcosta.workShop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.rcosta.workShop.entities.Orders;
import com.rcosta.workShop.repositoryes.OrderRepository;

@org.springframework.stereotype.Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	/* listar todos */
	public List<Orders> findAll() {
		return repository.findAll();
	}

	/* Buscando com parametro */
	public Orders findById(long id) {

		Optional<Orders> obj = repository.findById(id);
		return obj.get();
	}

}
