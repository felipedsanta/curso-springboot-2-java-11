package com.felps.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.workshop.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
