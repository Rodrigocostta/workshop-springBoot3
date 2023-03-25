package com.rcosta.workShop.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcosta.workShop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
