package com.felps.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.workshop.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
