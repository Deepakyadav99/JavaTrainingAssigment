package com.SpringPractices.SpringPractices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringPractices.SpringPractices.pojo.Customer;
import com.SpringPractices.SpringPractices.service.CustomerService;

@RestController
public class CustController {

	@Autowired
	CustomerService custservce;
	
	@GetMapping("/getCustomer")
	public List<Customer> getAll(){
		
		return custservce.get();
	}
}
