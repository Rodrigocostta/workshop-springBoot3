package com.rcosta.workShop.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcosta.workShop.entities.OrderItem;

public interface OrderItemRepsitory  extends JpaRepository<OrderItem, Long>{

}
