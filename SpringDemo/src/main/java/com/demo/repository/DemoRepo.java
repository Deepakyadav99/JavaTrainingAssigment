package com.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Customer;

@Repository
public interface DemoRepo extends JpaRepository<Customer, Integer> {

	Optional<Customer> save(int id);

	
}
