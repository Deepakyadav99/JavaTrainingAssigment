package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Customer;
import com.demo.repository.DemoRepo;

@Service
public class CustomerService {
	@Autowired
	DemoRepo demoRepo;

	public List<Customer> add() {

		return demoRepo.findAll();
	}

	public Customer save(Customer customer) {

		return demoRepo.save(customer);
	}

	public Optional<Customer> getbyid(int id) {

		return demoRepo.findById(id);
	}

	public String deleteRecord(int id) {
		demoRepo.deleteById(id);
		return "delete data successfully";
	}
	
	
	public void Update(Customer customer) {
		
		demoRepo.save(customer); 
	}  


	public Optional<Customer> findById(int id) {
		
		return demoRepo.save(id);
	}  


}
