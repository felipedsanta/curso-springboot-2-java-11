package com.felps.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.workshop.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
