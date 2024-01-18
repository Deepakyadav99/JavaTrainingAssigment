package com.SpringPractices.SpringPractices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringPractices.SpringPractices.Repository.CustomerRepo;
import com.SpringPractices.SpringPractices.pojo.Customer;

@Service
public class CustomerService implements ICustomer {

	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public List<Customer> get() {
		
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(1,"a", "b", "c"));
		list.add(new Customer(2,"a", "b", "c"));
		list.add(new Customer(3,"a", "b", "c"));
		list.add(new Customer(4,"a", "b", "c"));
		
		customerRepo.saveAll(list);
		
		List<Customer> alist = customerRepo.findAll();
		return alist;
	}

		
	}
