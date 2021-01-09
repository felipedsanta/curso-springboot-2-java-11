package com.felps.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.workshop.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
