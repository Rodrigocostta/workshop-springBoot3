package com.rcosta.workShop.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcosta.workShop.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
