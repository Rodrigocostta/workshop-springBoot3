package com.rcosta.workShop.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcosta.workShop.entities.Category;

public interface CategoryReository  extends JpaRepository<Category,Long>{

}
