package com.felps.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
