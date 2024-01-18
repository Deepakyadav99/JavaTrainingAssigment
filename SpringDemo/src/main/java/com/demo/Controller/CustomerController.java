package com.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Customer;
import com.demo.repository.DemoRepo;
import com.demo.services.CustomerService;

@RestController

public class CustomerController {

	@Autowired

	CustomerService demoService;
	@Autowired
	DemoRepo repo;

	@RequestMapping(value = "/printadd", method = RequestMethod.GET)
//	@ResponseBody
	public List<Customer> print() {

		return demoService.add();
	}

	@PostMapping("/save")

	public Customer save(@RequestBody Customer customer) {

		return demoService.save(customer);
	}

	@GetMapping("/print/{id}")
	public Optional<Customer> getbyyid(@PathVariable int id) {
		return demoService.getbyid(id);
	}

	@GetMapping("/printrp")
	@ResponseBody
	public Optional<Customer> getbyid(@RequestParam int id) {

		return demoService.getbyid(id);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteRecord(@PathVariable int id) {

		demoService.deleteRecord(id);
		return "delete data from db successfully";
		}

	  @PutMapping("/update")  
	  private Customer update(@RequestBody Customer customer)   
	  {  
		  demoService.Update(customer);  
	  return customer;  
	  }  
	
	  @PatchMapping("/patch/{id}")  
	  public Customer patch(@PathVariable (value="id") int id,@RequestBody Customer customer)   
	  {  
		  try {
			  Customer customer1 = demoService.findById(id).get();
			  
				return demoService.save(customer1);
			} catch (Exception e) {
				
			}
		return customer;
	  
	  }  
	  
	}


