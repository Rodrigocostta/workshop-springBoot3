package com.rcosta.workShop.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcosta.workShop.entities.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>  {

}
