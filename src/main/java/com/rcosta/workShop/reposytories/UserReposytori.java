package com.rcosta.workShop.reposytories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcosta.workShop.entities.User;

public interface UserReposytori extends JpaRepository<User, Long> {
	

}
