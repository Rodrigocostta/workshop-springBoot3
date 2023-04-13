package com.rcosta.workShop.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcosta.workShop.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category,Long>{

}
